package lesson6.lap6app;


import java.util.ArrayList;
import java.util.List;

public class Data {
    public static final Data INSTANCE = new Data();
    public static final String MESSIAH_OF_DUNE = "Messiah Of Dune";
    public static final String GONE_WITH_THE_WIND = "Gone With The Wind";
    public static final String GARDEN_OF_RAMA = "Garden of Rama";
    public static List<String> bookTitles = new ArrayList<>() {
        {
            this.add(MESSIAH_OF_DUNE);
            this.add(GONE_WITH_THE_WIND);
            this.add(GARDEN_OF_RAMA);
        }
    };
    public static Auth currentAuth = null;
    public static List<User> logins = new ArrayList<>() {
        {
            this.add(new User("Joe", "111", Auth.SELLER));
            this.add(new User("Ann", "101", Auth.MEMBER));
            this.add(new User("Dave", "102", Auth.BOTH));
        }
    };
    public static List<Author> authors = new ArrayList<>();

    private Data() {
    }

    public static void addBookTitle(String title) {
        bookTitles.add(title);
    }

    public static void addAuthor(Author author) {
        authors.add(author);
    }
}
