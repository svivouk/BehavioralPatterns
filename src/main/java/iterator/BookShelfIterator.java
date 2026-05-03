package iterator;

import java.util.PrimitiveIterator;

public class BookShelfIterator implements Iterator<String> {
    private BookShelf bookShelf;
    private int index = 0;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getSize();
    }

    @Override
    public String next() {
        return bookShelf.getBook(index++);
    }
}
