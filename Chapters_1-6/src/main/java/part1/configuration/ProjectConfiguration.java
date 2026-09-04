package part1.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part1.proxies", "part1.services", "part1.repositories"})
public class ProjectConfiguration {

}
