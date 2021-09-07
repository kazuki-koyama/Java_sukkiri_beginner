import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    // Function<String, Integer> func = s -> s.length();
    // System.out.println("文字列「Java」は" + func.apply("Java") + "文字です");

    // 練習問題3-1
    FuncList funclist = new FuncList();
    Func1 f1 = FuncList::isOdd;
    Func2 f2 = funclist::passCheck;
    System.out.println(f1.call(15));
    System.out.println(f2.call(66, "Smith"));
  }
}
