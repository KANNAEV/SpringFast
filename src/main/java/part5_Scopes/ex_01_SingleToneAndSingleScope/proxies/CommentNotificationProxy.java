package part5_Scopes.ex_01_SingleToneAndSingleScope.proxies;

import part5_Scopes.ex_01_SingleToneAndSingleScope.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
