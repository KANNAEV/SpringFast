package part4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part4.configuration.ProjectConfiguration;
import part4.models.Comment;
import part4.services.CommentService;

public class TestDrive {
    public static void main(String[] args) {
        Comment comment = new Comment("Sam", "Buy fuel for the car");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var commentServiceSp = context.getBean(CommentService.class);
        commentServiceSp.publishComment(comment);

    }
}
