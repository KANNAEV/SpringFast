package task1.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"task1.proxies", "task1.services", "task1.repositories"})
public class ProjectConfiguration {

}
