import java.awt.print.Book;
import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book2> satchel;

    public Borrower(String name) {
        this.name = name;
        this.satchel = new ArrayList<>();
    }

    public int paperbackCount() {
        return this.satchel.size();
    }

    public void stealBookFromLibrary(Library library) {
        Book2 book = library.removePaperback();
        this.satchel.add(book);
    }
}
