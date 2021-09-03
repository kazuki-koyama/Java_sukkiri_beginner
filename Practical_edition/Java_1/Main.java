import java.util.*;

public class Main {
  public static void main(String[] args) {
    // equalsメソッドのオーバーライド
    // Account a1 = new Account();
    // a1.accountNo = "001";

    // System.out.println(a1.equals(a1));
    // System.out.println(a1.equals(null));
    // String s1 = "";
    // System.out.println(a1.equals(s1));
    // Account a2 = new Account();
    // a2.accountNo = "002";
    // System.out.println(a1.equals(a2));
    // a2.accountNo = " 001";
    // System.out.println(a1.equals(a2));

    // 配列の等価判定
    // int[] a = { 1, 2, 3, 4, 5 };
    // int[] b = { 1, 2, 3, 4, 5 };
    // System.out.println("誤った判定：" + a.equals(b));
    // System.out.println("正しい判定：" + Arrays.equals(a, b));

    // 並び替え
    List<Account> list = new ArrayList<>();
    Account a1 = new Account();
    Account a2 = new Account();
    a1.number = 200;
    a2.number = 100;
    list.add(a1);
    list.add(a2);

    System.out.println("ソート前：");
    for (Account a : list) {
      System.out.println(a.number);
    }

    Collections.sort(list);

    System.out.println("ソート後：");
    for (Account a : list) {
      System.out.println(a.number);
    }
  }
}