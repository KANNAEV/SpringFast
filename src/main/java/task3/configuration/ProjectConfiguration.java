package task3.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task3.proxies.CommentNotificationProxy;
import task3.proxies.EmailCommentNotificationProxy;
import task3.repositories.CommentRepository;
import task3.repositories.DBCommentRepository;
import task3.services.CommentService;

@Configuration
public class ProjectConfiguration {
	@Bean
	public CommentRepository commentRepository() {
		return new DBCommentRepository();
	}

	@Bean
	public EmailCommentNotificationProxy commentNotificationProxy() {
		return new EmailCommentNotificationProxy();
	}

	@Bean
	public CommentService commentService(
			CommentRepository commentRepository,
			CommentNotificationProxy commentNotificationProxy) {
		return new CommentService(commentRepository, commentNotificationProxy);
	}
	

}
