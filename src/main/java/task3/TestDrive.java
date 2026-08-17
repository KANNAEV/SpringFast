package task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task3.configuration.ProjectConfiguration;
import task3.models.Comment;
import task3.services.CommentService;

public class TestDrive {
	public static void main(String[] args) {
		Comment comment = new Comment("Sam", "Buy fuel for the car");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

		var commentServiceSp = context.getBean(CommentService.class);
		commentServiceSp.publishComment(comment);

	}
}
