package hu.uni.miskolc.iit.swtest.library.core.console;

import hu.uni.miskolc.iit.swtest.library.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConsoleConfig.class);
        BookController controller = (BookController) context.getBean("bookController", BookController.class);

        System.out.println(controller.listAllBooks());

    }
}
