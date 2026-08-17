package task1.proxies;

import task1.models.Comment;

public interface CommentNotificationProxy {
	void sendComment(Comment comment);
}
