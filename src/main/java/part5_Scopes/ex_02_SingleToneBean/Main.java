package part5_Scopes.ex_02_SingleToneBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var myComments1 = context.getBean(CommentRepository.class);
        var myComments2 = context.getBean(CommentRepository.class);

        // Проверяем, что оба бина ссылаются на 1 область памяти (single tone scope)
        System.out.println(myComments1 == myComments2); // true


        // 2 разных бина могут использовать 1 и тот же бин из scope
        var a = context.getBean(PrintCommentLower.class);
        var b = context.getBean(PrintCommentUpper.class);

        a.printComment(String.valueOf(myComments1.comments.getFirst()));
        b.printComment(String.valueOf(myComments2.comments.getFirst()));


    }
}
