package practice_area.iterator;

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
    

    private class PostIterator implements Iterator<Post>{
        int size=0;
        
        @Override
        public boolean hasNext() {
            return size<=posts.size();
        }
    
        @Override
        public Post next() {
            return posts.get(size++);
        }
        
    }
}

