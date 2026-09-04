package part1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.configuration.ProjectConfiguration;
import part1.models.Comment;
import part1.proxies.CommentNotificationProxy;
import part1.proxies.EmailCommentNotificationProxy;
import part1.repositories.CommentRepository;
import part1.repositories.DBCommentRepository;
import part1.services.CommentService;

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
