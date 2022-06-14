import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book2 book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("Nigel");
        book = new Book2();
        library = new Library();
        library.addPaperback(book);
    }

    @Test
    public void satchelStartsEmpty(){
        assertEquals(0,borrower.paperbackCount());
    }

    @Test
    public void getBook(){
        borrower.stealBookFromLibrary(library);
        assertEquals(1, borrower.paperbackCount());
    }
}
