package task4.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"task4.proxies", "task4.repositories", "task4.services"})
public class ProjectConfiguration {
}
