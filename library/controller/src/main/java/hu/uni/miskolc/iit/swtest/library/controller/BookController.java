package hu.uni.miskolc.iit.swtest.library.controller;

import hu.uni.miskolc.iit.swtest.library.core.model.Book;
import hu.uni.miskolc.iit.swtest.library.core.service.BookSearchService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Hello world!
 *
 */
public class BookController
{
    private BookSearchService bookSearchService;

    public BookController(BookSearchService bookSearchService) {
        this.bookSearchService = bookSearchService;
    }

    @RequestMapping("/books")
    @ResponseBody
    public Collection<Book> listAllBooks(){
        return bookSearchService.listBooks();
    }
}
