import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    // Function<String, Integer> func = s -> s.length();
    // System.out.println("文字列「Java」は" + func.apply("Java") + "文字です");

    // 練習問題3-1
    // --独自インタフェースver-------------
    Func1 f1 = FuncList::isOdd;
    FuncList funclist = new FuncList(); // Func2のpassCheckはstaticではないため、まずインスタンス化
    Func2 f2 = funclist::passCheck;
    System.out.println(f1.call(15));
    System.out.println(f2.call(66, "Smith"));
    // --標準関数インタフェースver---------
    // Predicate<Integer> f1 = FuncList::isOdd;
    // FuncList funclist = new FuncList();
    // BiFunction<Integer, String, String> f2 = funclist::passCheck;
    // System.out.println(f1.test(15));
    // System.out.println(f2.apply(66, "Smith"));
  }
}
