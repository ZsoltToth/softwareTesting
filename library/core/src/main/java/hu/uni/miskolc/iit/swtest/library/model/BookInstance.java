package hu.uni.miskolc.iit.swtest.library.model;

import java.util.Collection;
import java.util.List;

/**
 * Created by tothzs on 2017.10.10..
 */
public class BookInstance {

    private final int inventoryNo;
    private Status status;
    private Book book;

    public BookInstance(int inventoryNo, Book book) {
        this.inventoryNo = inventoryNo;
        this.book = book;
    }

    public BookInstance(int inventoryNo, Status status, Book book) {
        this.inventoryNo = inventoryNo;
        this.status = status;
        this.book = book;
    }

    public int getInventoryNo() {
        return inventoryNo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitle() {
        return this.book.getTitle();
    }

    public double getPrice() {
        return this.book.getPrice();
    }

    public List<Author> getAuthors() {
        return this.book.getAuthors();
    }

    public Collection<Genre> getGenre() {
        return this.book.getGenre();
    }

    public String getIsbn() {
        return book.getIsbn();
    }

    public static enum Status{
        IN_LIBRARY, BORROWED, RESERVED
    }
}