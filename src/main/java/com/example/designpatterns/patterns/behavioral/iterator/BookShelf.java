package com.example.designpatterns.patterns.behavioral.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * Demo BookShelf
 *
 * @author Wolf-Liu
 * @date 2020/4/16 23:45
 */
public class BookShelf {
    private List<Book> books = new LinkedList<>();

    public BookShelfIterator iterator() {
        return new BookShelfIterator(this);
    }

    public Book get(int index) {
        return books.get(index);
    }

    public void add(Book book) {
        books.add(book);
    }

    public int size() {
        return books.size();
    }
}
