package part5_Scopes.ex_03_StereoTypeBean;

public class CommentService {
    public static int count = 0;

    public CommentService() {
        count++;
        System.out.println("Created " + count + " ServiceBeans");
    }
}
