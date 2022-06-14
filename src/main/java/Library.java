import java.util.ArrayList;

public class Library {

    private ArrayList<Book2> paperback;
    private int capacity = 100;

    public Library() {
        this.paperback = new ArrayList<>();
        this.capacity = capacity;
    }
    public int paperbackCount(){
        return this.paperback.size();
    }

    public void addPaperback(Book2 book) {
        if (paperbackCount() < capacity) {
            this.paperback.add(book);
        }
    }

    public Book2 removePaperback() {
        return this.paperback.remove(0);
    }
}
