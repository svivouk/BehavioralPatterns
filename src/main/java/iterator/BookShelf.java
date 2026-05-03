package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements IterableCollection<String>{
    private final List<String> books = new ArrayList<>();

    public void addBook(String book){
        books.add(book);
    }
    public String getBook(int index){
        return books.get(index);
    }
    public int getSize(){
        return books.size();
    }
    @Override
    public Iterator<String> createIterator() {
        return new BookShelfIterator(this);
    }
}
