package part5_Scopes.ex_01_SingleToneAndSingleScope.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import part5_Scopes.ex_01_SingleToneAndSingleScope.models.Comment;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment:" + comment);
    }

}
