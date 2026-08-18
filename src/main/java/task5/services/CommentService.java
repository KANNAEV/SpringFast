package task5.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import task5.models.Comment;
import task5.proxies.CommentNotificationProxy;
import task5.repositories.CommentRepository;

@Service
public class CommentService {
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;

	public CommentService(CommentRepository commentRepository,
	                      @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}

	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		System.out.print("\f");
		commentNotificationProxy.sendComment(comment);

	}
}
