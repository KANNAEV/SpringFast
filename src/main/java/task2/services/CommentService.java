package task2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import task2.models.Comment;
import task2.proxies.CommentNotificationProxy;
import task2.repositories.CommentRepository;

@Component
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private CommentNotificationProxy commentNotificationProxy;


	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		System.out.print("\f");
		commentNotificationProxy.sendComment(comment);

	}
}
