package task6_StereoTypeBean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ProjectConfig {
	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public CommentService commentService() {
		return new CommentService();
	}
}
