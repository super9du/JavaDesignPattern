package com.example.designpatterns.patterns.behavioral.iterator;

/**
 * Demo IteratorTest
 *
 * @author Wolf-Liu
 * @date 2020/4/17 0:01
 */
public class IteratorTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.add(threeKingdoms());
        bookShelf.add(journey2TheWest());

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }

    /**
     * 三国演义
     */
    private static Book threeKingdoms() {
        Book book = new Book();
        book.setName("Three Kingdom");
        book.setAuthor("Lou Guan Zhong");
        return book;
    }

    /**
     * 西游记
     */
    private static Book journey2TheWest() {
        Book book = new Book();
        book.setName("Journey to The West");
        book.setAuthor("Wu Cheng En");
        return book;
    }
}
