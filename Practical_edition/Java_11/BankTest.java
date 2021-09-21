import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
  // (1)正常系：3文字をセットできるか
  @Test public void setName() {
    Bank b = new Bank();
    b.setName("ミヤビ");
  }

  // (2)異常系：nullをセットしようとしたら例外が起きるか
  @Test public void getNameWithNull() {
    try {
      Bank b = new Bank();
      b.setName(null);
    } catch (NullPointerException e) {
      return;
    }
    fail();
  }
  
  // (3)異常系：２文字をセットしようとしたら例外が起こるか
  @Test
  public void throwsExceptionWithTwoName() {
    Bank b = new Bank();
    assertThrows(IllegalArgumentException.class, () -> { b.setName("ミヤ");});
  }
}
