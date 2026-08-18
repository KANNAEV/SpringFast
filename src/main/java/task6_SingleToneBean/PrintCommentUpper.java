package task6_SingleToneBean;

import java.util.Locale;

public class PrintCommentUpper implements PrintComment {


	@Override
	public void printComment(String comment) {
		System.out.println(comment.toUpperCase(Locale.ROOT));
	}
}
