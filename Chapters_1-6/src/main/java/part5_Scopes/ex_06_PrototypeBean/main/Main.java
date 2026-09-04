package part5_Scopes.ex_06_PrototypeBean.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part5_Scopes.ex_06_PrototypeBean.config.ProjectConfig;
import part5_Scopes.ex_06_PrototypeBean.services.CommentService;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(CommentService.class);

        boolean b = (s1 == s2);

        System.out.println(b);
    }
}
