package part5_Scopes.ex_08_RacingProcessor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"part5_Scopes.ex_08_RacingProcessor.services",
		"part5_Scopes.ex_08_RacingProcessor.repositories",
		"part5_Scopes.ex_08_RacingProcessor.processors"})
public class ProjectConfig {

}
