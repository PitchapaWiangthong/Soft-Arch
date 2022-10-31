<<<<<<< HEAD
import java.util.List;
import java.util.ListIterator;

public class Book {
    private String title;
    private List<String> pages;
    private ListIterator<String> iterator;
    private String currentPage;

    public Book(String title, List<String> pages) {
        this.title = title;
        this.pages = pages;
        iterator = pages.listIterator();
        if (iterator.hasNext()) {
            currentPage = iterator.next();
        } else {
            currentPage = null;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public boolean turnToNextPage() {
        if (iterator.hasNext()) {
            currentPage = iterator.next();
            return true;
        } else {
            return false;
        }
    }

}
=======
import java.util.List;
import java.util.ListIterator;

public class Book {
    private String title;
    private List<String> pages;
    private ListIterator<String> iterator;
    private String currentPage;

    public Book(String title, List<String> pages) {
        this.title = title;
        this.pages = pages;
        iterator = pages.listIterator();
        if (iterator.hasNext()) {
            currentPage = iterator.next();
        } else {
            currentPage = null;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public boolean turnToNextPage() {
        if (iterator.hasNext()) {
            currentPage = iterator.next();
            return true;
        } else {
            return false;
        }
    }

}
>>>>>>> 5897a6ffa84f8ef485d749615856c4c67a050c15
