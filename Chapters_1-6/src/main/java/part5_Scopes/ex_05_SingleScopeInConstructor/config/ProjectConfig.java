package part5_Scopes.ex_05_SingleScopeInConstructor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part5_Scopes.ex_05_SingleScopeInConstructor.services", "part5_Scopes.ex_05_SingleScopeInConstructor.repositories"})
public class ProjectConfig {

}
