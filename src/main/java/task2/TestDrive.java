package task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task2.configuration.ProjectConfiguration;
import task2.models.Comment;
import task2.services.CommentService;

public class TestDrive {
	public static void main(String[] args) {
		Comment comment = new Comment("Sam", "Buy fuel for the car");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		var commentServiceSp = context.getBean(CommentService.class);
		commentServiceSp.publishComment(comment);

	}
}
