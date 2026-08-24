package part5_Scopes.ex_08_RacingProcessor.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import part5_Scopes.ex_08_RacingProcessor.model.Comment;
import part5_Scopes.ex_08_RacingProcessor.repositories.CommentRepository;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

	int numberOfMethodsCalls = 0;

	@Autowired
	private CommentRepository commentRepository;

	private Comment comment;

	public int getNumberOfMethodsCalls() {
		return numberOfMethodsCalls;
	}

	public Comment getComment() {

		numberOfMethodsCalls++;
		return this.comment;
	}

	public void setComment(Comment comment) {
		numberOfMethodsCalls++;
		this.comment = comment;
	}

	public void processComment(Comment comment) {
		numberOfMethodsCalls++;
	}

	public void validateComment(Comment comment) {
		numberOfMethodsCalls++;
	}
}
