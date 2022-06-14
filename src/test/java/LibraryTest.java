import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book2 book;

    @Before public void before(){
        library = new Library();
        book = new Book2();
    }
    @Test public void canAddBook(){
        library.addPaperback(book);
        assertEquals(1, library.paperbackCount());
    }
}
