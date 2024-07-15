package Iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        Post post1=new Post("ramesh","blue sky");
        Post post2=new Post("suresh","cloudy with a chance of rain");
        Post post3=new Post("mahesh","winter is here");
        PostFeed posts=new PostFeed();
        posts.addPost(post1);
        posts.addPost(post2);
        posts.addPost(post3);
        Iterator postsIterator=posts.getIterator();
        while(postsIterator.hasNext()){
            System.out.println(postsIterator.next());
        }
    }
}
