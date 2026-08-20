package part4.repositories;

import part4.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
