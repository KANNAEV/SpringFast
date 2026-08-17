package task3.proxies;

import task3.models.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending comment:" + comment);
	}

}
