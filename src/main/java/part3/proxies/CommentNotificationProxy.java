package part3.proxies;

import part3.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
