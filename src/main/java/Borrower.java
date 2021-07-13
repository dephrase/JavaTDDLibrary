import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> bookCollection;

    public Borrower(String name){
        this.name = name;
        this.bookCollection = new ArrayList<>();
    }

    public int getCollectionSize() {
        return this.bookCollection.size();
    }

    public void addBookToCollection(Book removedBook) {
        this.bookCollection.add(removedBook);
    }
}
