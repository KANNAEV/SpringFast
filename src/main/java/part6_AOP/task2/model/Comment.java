package part6_AOP.task2.model;

public class Comment {
	public String author;
	public String text;

	public Comment(String author, String text) {
		this.author = author;
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return getAuthor() + ":" + getText();
	}
}
