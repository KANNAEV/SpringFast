package part6_AOP.task1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part6_AOP.task1.config.AppConfig;
import part6_AOP.task1.model.Comment;
import part6_AOP.task1.services.CommentService;

public class TestDrive {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(AppConfig.class);

		var service = context.getBean(CommentService.class);
		var comment = new Comment("Hello", "Admin");
		service.publishComment(comment);
	}
}
