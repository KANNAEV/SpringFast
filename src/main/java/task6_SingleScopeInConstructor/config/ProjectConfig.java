package task6_SingleScopeInConstructor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"task6_SingleScopeInConstructor.services", "task6_SingleScopeInConstructor.repositories"})
public class ProjectConfig {

}
