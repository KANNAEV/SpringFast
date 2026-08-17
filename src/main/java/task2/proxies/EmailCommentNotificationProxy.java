package task2.proxies;

import org.springframework.stereotype.Component;
import task2.models.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending comment:" + comment);
	}

}
