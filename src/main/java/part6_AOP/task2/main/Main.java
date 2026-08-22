package part6_AOP.task2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part6_AOP.task2.config.AppConfig;
import part6_AOP.task2.model.Comment;
import part6_AOP.task2.services.CommentService;

import java.util.logging.Logger;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(AppConfig.class);

		var comment = new Comment("gadzhi", "hello world");

		var cs = context.getBean(CommentService.class);
		String result = cs.proceedComment(comment);

		// Вывести значение, возвращаемое методом publishComment()
		logger.info(result);


	}
}
