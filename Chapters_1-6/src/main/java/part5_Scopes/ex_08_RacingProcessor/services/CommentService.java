package part5_Scopes.ex_08_RacingProcessor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import part5_Scopes.ex_08_RacingProcessor.model.Comment;
import part5_Scopes.ex_08_RacingProcessor.processors.CommentProcessor;

@Service
public class CommentService {

	@Autowired
	private ApplicationContext context;

	public void sendComment(Comment c) {

		CommentProcessor p = context.getBean(CommentProcessor.class);

		p.setComment(c);
		p.processComment(c);
		p.validateComment(c);

		c = p.getComment();
		System.out.println("Sending comment" + c);
		System.out.println(p.getNumberOfMethodsCalls());
	}

}
