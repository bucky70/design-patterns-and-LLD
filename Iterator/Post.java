package Iterator;

public class Post {
    private String author;
    private String postTitle;
    public Post(String author, String postTitle){
        this.author=author;
        this.postTitle=postTitle;
    }
    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", postTitle='" + postTitle + '\'' +
                '}';
    }
   
}
