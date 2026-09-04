package part3.repositories;

import part3.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
