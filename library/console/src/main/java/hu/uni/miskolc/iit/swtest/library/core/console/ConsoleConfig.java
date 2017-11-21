package hu.uni.miskolc.iit.swtest.library.core.console;

import hu.uni.miskolc.iit.swtest.library.controller.BookController;
import hu.uni.miskolc.iit.swtest.library.core.dao.BookDAO;
import hu.uni.miskolc.iit.swtest.library.core.service.BookSearchService;
import hu.uni.miskolc.iit.swtest.library.core.service.impl.BookSearchServiceImpl;
import hu.uni.miskolc.iit.swtest.library.dao.BookJSONDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

/**
 * Created by tothzs on 2017.11.21..
 */
@Configuration
public class ConsoleConfig {

    public static final String BOOK_DB_PATH = "book_db_path";

    @Bean(value = "bookController")
    public BookController bookController(){
        return new BookController(bookSearchService());
    }

//    @Bean("bookSearchService")
    public BookSearchService bookSearchService(){
        return new BookSearchServiceImpl(bookDAO());
    }

//    @Bean
    public BookDAO bookDAO(){
//        System.out.println(System.getenv().get(BOOK_DB_PATH));
        return new BookJSONDAO(new File(System.getProperty(BOOK_DB_PATH)));
    }
}
