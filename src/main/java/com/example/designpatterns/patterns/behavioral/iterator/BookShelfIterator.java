package com.example.designpatterns.patterns.behavioral.iterator;

/**
 * Demo BookShelfIterator
 *
 * @author Wolf-Liu
 * @date 2020/4/16 23:52
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public Object next() {
        Book book = bookShelf.get(index);
        index++;
        return book;
    }

    @Override
    public boolean hasNext() {
        if (index == bookShelf.size()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }
}
