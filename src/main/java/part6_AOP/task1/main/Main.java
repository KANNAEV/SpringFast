package part6_AOP.task1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part6_AOP.task1.config.AppConfig;
import part6_AOP.task1.model.Comment;
import part6_AOP.task1.services.CommentService;

public class Main {
	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(AppConfig.class);

		var comment = new Comment("gadzhi", "hello world");

		var cs = context.getBean(CommentService.class);
		cs.proceedComment(comment);

	}
}
