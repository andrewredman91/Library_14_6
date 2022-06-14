//import java.util.ArrayList;
//
//public class Book {
//    private String title;
//    private String author;
//    private String genre;
//    private ArrayList<Book> library;
//    private int storage = 10;
//
//    public Book(String title, String author, String genre){
//        this.title = title;
//        this.author = author;
//        this.genre = genre;
//        this.library = new ArrayList<>();
//        this.storage = storage;
//    }
//
//    public int bookCount() {
//        return this.library.size();
//    }
//
//    public void addBookToLibrary(Book book) {
//        if(bookCount() < storage){
//            this.library.add(book);
//        }
//    }
//}
