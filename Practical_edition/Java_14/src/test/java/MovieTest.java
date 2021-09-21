
/**
 * MovieTest
 */
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

  @Test
  public void testInstantiateWithNoArgument() {
    Movie m = new Movie();
    assertEquals("ダミー", m.title);
  }

  @Test
  public void testInstantiateWithOneArgument() {
    Movie m1 = new Movie("Title");
    assertEquals("Title", m1.title);
  }
}