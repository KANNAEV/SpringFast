package part5_Scopes.ex_02_SingleToneBean;

public class Comment {
    private String comment;
    private String author;

    Comment(String author, String comment) {
        this.author = author;
        this.comment = comment;

    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return author + ":" + comment;
    }
}
