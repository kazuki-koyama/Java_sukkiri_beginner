import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    // Function<String, Integer> func = s -> s.length();
    // System.out.println("文字列「Java」は" + func.apply("Java") + "文字です");

    // 練習問題3-1
    // --独自インタフェースver-------------
    // Func1 f1 = FuncList::isOdd;
    // FuncList funclist = new FuncList(); // Func2のpassCheckはstaticではないため、まずインスタンス化
    // Func2 f2 = funclist::passCheck;
    // System.out.println(f1.call(15));
    // System.out.println(f2.call(66, "Smith"));
    // --標準関数インタフェースver---------
    // Predicate<Integer> f1 = FuncList::isOdd;
    // FuncList funclist = new FuncList();
    // BiFunction<Integer, String, String> f2 = funclist::passCheck;
    // System.out.println(f1.test(15));
    // System.out.println(f2.apply(66, "Smith"));

    // 練習問題3-2
    Func1 f1 = x -> x % 2 == 1;
    Func2 f2 = (point, name) -> {
      return name + "さんは" + (point > 65 ? "合格" : "不合格");
    };
    System.out.println(f1.call(15));
    System.out.println(f2.call(66, "Smith"));
  }
}
