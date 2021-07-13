import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private ArrayList<Book> stock;
    private int capacity;
    private HashMap<String, Integer> booksByGenre;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        stock = new ArrayList<>();
        booksByGenre = new HashMap<>();
    }

    public int getBooks() {
        return this.stock.size();
    }

    public void addBookToLibrary(Book book) {
        if(stock.size() < this.capacity){
            this.stock.add(book);
        }
        String genre = book.getGenre();
        if(booksByGenre.containsKey(genre)){
            booksByGenre.put(genre, (booksByGenre.get(genre) + 1));
        } else {
            booksByGenre.put(genre, 1);
        }

    }

    public int getCapacity() {
        return this.capacity - stock.size();
    }

    public Book removeBookFromLibrary(Book book) {
        if(this.stock.contains(book)){
            this.stock.remove(book);
            return book;
        } else {
            return null;
        }
    }

    public Object booksByGenreKeys() {
        int genres = booksByGenre.keySet().toArray().length;
        return genres;
    }

    public int getNumberOfBooksOfGenre(String genre) {
        if(!booksByGenre.containsKey(genre)){
            return 0;
        } else {
            return booksByGenre.get(genre);
        }
    }
}
