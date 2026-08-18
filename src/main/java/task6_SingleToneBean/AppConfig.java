package task6_SingleToneBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public CommentRepository commentRepository() {
		CommentRepository commentRepository = new CommentRepository();
		commentRepository.addComment("Gadzhi", "Hello World");
		return commentRepository;
	}

	@Bean
	public PrintComment printCommentLower() {
		return new PrintCommentLower() {

		};
	}

	@Bean
	public PrintComment printCommentUpper() {
		return new PrintCommentUpper();
	}
}
