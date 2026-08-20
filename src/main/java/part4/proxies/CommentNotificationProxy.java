package part4.proxies;

import part4.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
