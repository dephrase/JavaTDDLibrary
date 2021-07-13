import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void setUp(){
        library = new Library("The Library", 2);
        book = new Book("Infinite Jest", "DFW", "Depressing");
    }

    @Test
    public void libraryStartsWithNoBooks(){
        assertEquals(0, library.getBooks());
    }

    @Test
    public void canAddBooksToLibrary(){
        library.addBookToLibrary(book);
        assertEquals(1, library.getBooks());
    }

    @Test
    public void libraryHasACapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void addingBookToLibraryReducesCapacity(){
        library.addBookToLibrary(book);
        assertEquals(1, library.getCapacity());
    }

    @Test
    public void canAddBookIfCapacityIsFull(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(0, library.getCapacity());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBookToLibrary(book);
        library.removeBookFromLibrary(book);
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void libraryHasEmptyListOfBooksByGenre(){
        assertEquals(0, library.booksByGenreKeys());
    }

    @Test
    public void canAddABookToTheBooksByGenreMap(){
        library.addBookToLibrary(book);
        assertEquals(1, library.getNumberOfBooksOfGenre("Depressing"));
    }

    @Test
    public void canAddMultipleBooksToGenreMap(){
        Book book2 = new Book("Hello", "Hello", "Depressing");
        library.addBookToLibrary(book);
        library.addBookToLibrary(book2);
        assertEquals(2, library.getNumberOfBooksOfGenre("Depressing"));
    }

    @Test
    public void canAddMultipleGenresToMap(){
        Book book2 = new Book("Hello", "Hello", "Action");
        library.addBookToLibrary(book);
        library.addBookToLibrary(book2);
        assertEquals(1, library.getNumberOfBooksOfGenre("Action"));
        assertEquals(1, library.getNumberOfBooksOfGenre("Depressing"));

    }

}
