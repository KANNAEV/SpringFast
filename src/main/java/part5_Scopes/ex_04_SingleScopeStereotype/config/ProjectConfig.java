package part5_Scopes.ex_04_SingleScopeStereotype.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part5_Scopes.ex_04_SingleScopeStereotype.services", "part5_Scopes.ex_04_SingleScopeStereotype.repositories"})
public class ProjectConfig {

}
