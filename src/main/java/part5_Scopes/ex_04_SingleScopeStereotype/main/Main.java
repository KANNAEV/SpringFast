package part5_Scopes.ex_04_SingleScopeStereotype.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part5_Scopes.ex_04_SingleScopeStereotype.config.ProjectConfig;
import part5_Scopes.ex_04_SingleScopeStereotype.services.CommentService;
import part5_Scopes.ex_04_SingleScopeStereotype.services.UserService;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b);
    }
}
