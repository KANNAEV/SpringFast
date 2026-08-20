package part5_Scopes.ex_01_SingleToneAndSingleScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part5_Scopes.ex_01_SingleToneAndSingleScope.models.Comment;
import part5_Scopes.ex_01_SingleToneAndSingleScope.services.CommentService;

public class TestDrive {
    public static void main(String[] args) {
        Comment comment = new Comment("Sam", "Buy fuel for the car");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db1.printDB();
        db2.printDB();

        System.out.println((db1 == db2) + " " + db1 + " " + db2);
    }
}
