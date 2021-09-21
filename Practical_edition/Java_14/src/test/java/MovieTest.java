
/**
 * MovieTest
 */
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

  @Test
  public void testInstantiateWithNoArgument() {
    Movie m = new Movie();
    assertThrows(IllegalArgumentException.class, () -> m.setTitle());
  }

  @Test
  public void testInstantiateWithOneArgument() {
    Movie m1 = new Movie("Title");
    assertThrows(IllegalArgumentException.class, () -> m1.setTitle("Tile"));
  }
}