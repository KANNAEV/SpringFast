package part2.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part2.proxies", "part2.services", "part2.repositories"})
public class ProjectConfiguration {

}
