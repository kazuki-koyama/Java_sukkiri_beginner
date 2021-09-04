import java.util.Comparator;
import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
  public int compare(Book x, Book y) {
    return x.getTitle().compareTo(y.getTitle());
  }
}