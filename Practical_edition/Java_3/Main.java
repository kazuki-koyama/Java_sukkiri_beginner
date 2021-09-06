import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    Function<String, Integer> func = s -> s.length();
    // Function<String, Integer> func = (String s) -> {
    // return s.length();
    // };
    System.out.println("文字列「Java」は" + func.apply("Java") + "文字です");
  }
}
