package part5_Scopes.ex_01_SingleToneAndSingleScope.repositories;

import org.springframework.stereotype.Repository;
import part5_Scopes.ex_01_SingleToneAndSingleScope.models.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
