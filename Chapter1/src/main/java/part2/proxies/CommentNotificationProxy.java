package part2.proxies;

import part2.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
