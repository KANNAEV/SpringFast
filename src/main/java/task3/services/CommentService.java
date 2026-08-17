package task3.services;

import task3.models.Comment;
import task3.proxies.CommentNotificationProxy;
import task3.repositories.CommentRepository;

public class CommentService {
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;

	public CommentService(CommentRepository commentRepository,
	                      CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}

	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		System.out.print("\f");
		commentNotificationProxy.sendComment(comment);

	}
}
