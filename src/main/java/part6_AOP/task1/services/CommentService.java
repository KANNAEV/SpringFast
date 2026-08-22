package part6_AOP.task1.services;

import org.springframework.stereotype.Service;
import part6_AOP.task1.model.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {
	// Logger с инициализацией имени класса
	private final Logger logger = Logger.getLogger(CommentService.class.getName());

	public void publishComment(Comment comment) {
		// Логика публикации
		logger.info("Publishing comment: " + comment.getText());
	}
}