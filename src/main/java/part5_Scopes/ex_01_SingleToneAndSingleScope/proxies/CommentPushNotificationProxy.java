package part5_Scopes.ex_01_SingleToneAndSingleScope.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import part5_Scopes.ex_01_SingleToneAndSingleScope.models.Comment;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println(
                "Sending push notification for comment: "
                        + comment.getText());
    }
}
