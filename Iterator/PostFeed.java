package Iterator;

import java.util.ArrayList;
import java.util.List;

public class PostFeed implements Container<Post>{

    List<Post> posts;
    public PostFeed(){
        posts=new ArrayList<>();
    }

    @Override
    public Iterator<Post> getIterator() {
       return new PostIterator();
    }
    public int getSize(){
        return posts.size();
    }
    public void addPost(Post post){
        posts.add(post);
    }
    private class PostIterator  implements Iterator<Post>{

        int index=0;
        @Override
        public boolean hasNext() {
           return index < posts.size();
        }
    
        @Override
        public Post next() {
           if(hasNext()){
            return posts.get(index++);
           }
           return null;
        }
    
       
        
    }
}
