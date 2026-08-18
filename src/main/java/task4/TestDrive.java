package task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task4.configuration.ProjectConfiguration;
import task4.models.Comment;
import task4.services.CommentService;

public class TestDrive {
	public static void main(String[] args) {
		Comment comment = new Comment("Sam", "Buy fuel for the car");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		var commentServiceSp = context.getBean(CommentService.class);
		commentServiceSp.publishComment(comment);

	}
}
