package part5_Scopes.ex_02_SingleToneBean;

import java.util.Locale;

public class PrintCommentLower implements PrintComment {

    @Override
    public void printComment(String comment) {
        System.out.println(comment.toLowerCase(Locale.ROOT));
    }
}
