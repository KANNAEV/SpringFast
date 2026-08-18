package task6_StereoTypeBean;

public class CommentService {
	public static int count = 0;

	public CommentService() {
		count++;
		System.out.println("Created " + count + " ServiceBeans");
	}
}
