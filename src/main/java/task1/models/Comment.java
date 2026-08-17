package task1.models;

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

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return author + "(" + text + ")";
	}

}
