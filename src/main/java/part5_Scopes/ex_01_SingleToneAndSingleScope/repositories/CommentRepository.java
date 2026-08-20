package part5_Scopes.ex_01_SingleToneAndSingleScope.repositories;

import part5_Scopes.ex_01_SingleToneAndSingleScope.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
