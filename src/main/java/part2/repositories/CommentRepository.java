package part2.repositories;

import part2.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
