package task5.repositories;

import org.springframework.stereotype.Repository;
import task5.models.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}
}
