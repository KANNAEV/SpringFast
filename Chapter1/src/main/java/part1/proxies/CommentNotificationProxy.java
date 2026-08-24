package part1.proxies;

import part1.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
