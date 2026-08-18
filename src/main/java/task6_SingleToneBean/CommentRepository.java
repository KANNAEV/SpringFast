package task6_SingleToneBean;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
	List<Comment> comments = new ArrayList<>();

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public void addComment(String author, String comment) {
		comments.add(new Comment(author, comment));
	}
}
