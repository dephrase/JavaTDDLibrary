import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void setup(){
        borrower = new Borrower("David");
        book = new Book("Blood Meridian", "McCarthy", "Adventure");
        library = new Library("The Library", 3);
    }

    @Test
    public void borrowerStartsWithEmptyCollection(){
        assertEquals(0, borrower.getCollectionSize());
    }

    @Test
    public void borrowerCanAddBookToCollection(){
        library.addBookToLibrary(book);
        Book removedBook = library.removeBookFromLibrary(book);
        borrower.addBookToCollection(removedBook);
        assertEquals(1, borrower.getCollectionSize());
        assertEquals(3, library.getCapacity());
    }
}
