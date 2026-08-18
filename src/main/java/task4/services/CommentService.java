package task4.services;

import org.springframework.stereotype.Component;
import task4.models.Comment;
import task4.proxies.CommentNotificationProxy;
import task4.repositories.CommentRepository;

@Component
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
