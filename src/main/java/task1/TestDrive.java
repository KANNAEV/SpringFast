package task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task1.configuration.ProjectConfiguration;
import task1.models.Comment;
import task1.proxies.CommentNotificationProxy;
import task1.proxies.EmailCommentNotificationProxy;
import task1.repositories.CommentRepository;
import task1.repositories.DBCommentRepository;
import task1.services.CommentService;

public class TestDrive {
	public static void main(String[] args) {
		Comment comment = new Comment("Sam", "Buy fuel for the car");

		CommentRepository saveCommentToDB = new DBCommentRepository();
		CommentNotificationProxy sendCommentViaMail = new EmailCommentNotificationProxy();
		CommentService commentService = new CommentService(saveCommentToDB, sendCommentViaMail);

		commentService.publishComment(comment);

		// То же самое с помощью Spring
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		var commentServiceSp = context.getBean(CommentService.class);
		commentServiceSp.publishComment(comment);

	}
}
