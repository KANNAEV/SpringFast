package task6_SingleScopeStereotype.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"task6_SingleScopeStereotype.services", "task6_SingleScopeStereotype.repositories"})
public class ProjectConfig {

}
