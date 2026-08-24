package part4.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part4.proxies", "part4.repositories", "part4.services"})
public class ProjectConfiguration {
}
