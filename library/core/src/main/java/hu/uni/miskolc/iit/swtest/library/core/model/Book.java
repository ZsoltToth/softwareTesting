package hu.uni.miskolc.iit.swtest.library.core.model;

import java.util.Collection;
import java.util.List;

/**
 * Created by tothzs on 2017.10.10..
 */
public class Book {

    private final String isbn;
    private String title;
    private double price;
    private List<Author> authors;
    private Collection<Genre> genre;

    public Book(String isbn, String title, double price, List<Author> authors, Collection<Genre> genre) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.authors = authors;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Collection<Genre> getGenre() {
        return genre;
    }
}
