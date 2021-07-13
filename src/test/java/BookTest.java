import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setup(){
        book = new Book("Moby Dick", "Herman Melville", "Adventure");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Moby Dick", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Herman Melville", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Adventure", book.getGenre());
    }
}
