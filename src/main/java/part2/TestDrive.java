package part2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part2.configuration.ProjectConfiguration;
import part2.models.Comment;
import part2.services.CommentService;

public class TestDrive {
    public static void main(String[] args) {
        Comment comment = new Comment("Sam", "Buy fuel for the car");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var commentServiceSp = context.getBean(CommentService.class);
        commentServiceSp.publishComment(comment);

    }
}
