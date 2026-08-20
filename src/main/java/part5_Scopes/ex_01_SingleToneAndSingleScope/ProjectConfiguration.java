package part5_Scopes.ex_01_SingleToneAndSingleScope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part5_Scopes.p01.SingleToneAndSingleScope.proxies", "part5_Scopes.p01.SingleToneAndSingleScope.repositories", "part5_Scopes.p01.SingleToneAndSingleScope.services"})
public class ProjectConfiguration {
}
