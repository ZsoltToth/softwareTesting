package hu.uni.miskolc.iit.swtest.library.dao;

import hu.uni.miskolc.iit.swtest.library.core.model.Author;
import hu.uni.miskolc.iit.swtest.library.core.model.Book;
import hu.uni.miskolc.iit.swtest.library.core.model.Genre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by tothzs on 2017.10.10..
 */
class BookBean {

    private String isbn;
    private String title;
    private double price;
    private List<AuthorBean> authors;
    private Collection<Genre> genre;

    public BookBean(
    ) {

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<AuthorBean> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorBean> authors) {
        this.authors = authors;
    }

    public Collection<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Collection<Genre> genre) {
        this.genre = genre;
    }

    public static BookBean convert(Book book){
        BookBean result = new BookBean();
        result.setIsbn(book.getIsbn());
        result.setTitle(book.getTitle());
        result.setPrice(book.getPrice());
        result.setGenre(book.getGenre());
        List<AuthorBean> authorBeans = new ArrayList<AuthorBean>();
        for(Author author : book.getAuthors()){
            authorBeans.add(AuthorBean.convert(author));
        }
        result.setAuthors(authorBeans);
        return result;
    }

    public Book extract(){
        List<Author> a = new ArrayList<Author>();
        for(AuthorBean bean : this.authors){
            a.add(bean.extract());
        }
        return new Book(isbn,title,price,a,genre);
    }
}
