package part6_AOP.task1.services;

import org.springframework.stereotype.Service;
import part6_AOP.task1.model.Comment;

import java.util.Locale;
import java.util.logging.Logger;

@Service
public class CommentService {

	private Logger logger = Logger.getLogger(CommentService.class.getName());

	public void proceedComment(Comment comment) {
		comment.author = comment.getAuthor().toUpperCase(Locale.ROOT);
		comment.text = comment.getText().toUpperCase(Locale.ROOT);

		logger.info("!!!CommentService Work is Done!!! : proceeded  " + "\"" + comment.toString() + "\"");
	}
}
