package part1.proxies;

import org.springframework.stereotype.Component;
import part1.models.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment:" + comment);
    }

}
