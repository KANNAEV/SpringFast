package task2.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"task2.proxies", "task2.services", "task2.repositories"})
public class ProjectConfiguration {

}
