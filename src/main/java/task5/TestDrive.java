package task5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task5.configuration.ProjectConfiguration;
import task5.models.Comment;
import task5.services.CommentService;

public class TestDrive {
	public static void main(String[] args) {
		Comment comment = new Comment("Sam", "Buy fuel for the car");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		var commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
		DatabaseConnection db1 = DatabaseConnection.getInstance();
		DatabaseConnection db2 = DatabaseConnection.getInstance();
		db1.printDB();
		db2.printDB();

		System.out.println((db1 == db2) + " " + db1 + " " + db2);
	}
}
