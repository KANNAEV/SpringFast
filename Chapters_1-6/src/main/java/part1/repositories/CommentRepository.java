package part1.repositories;

import part1.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
