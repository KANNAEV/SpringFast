package part5_Scopes.ex_07_PrototypeStereo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part5_Scopes.ex_07_PrototypeStereo.services", "part5_Scopes.ex_07_PrototypeStereo.repositories"})
public class ProjectConfig {

}
