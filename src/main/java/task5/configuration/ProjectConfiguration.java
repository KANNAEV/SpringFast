package task5.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"task5.proxies", "task5.repositories", "task5.services"})
public class ProjectConfiguration {
}
