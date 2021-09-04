import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // 練習問題1-3
    SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
    List<Book> books = new ArrayList<>();

    Book b1 = new Book();
    b1.setTitle("Java入門");
    b1.setPublishDate(f.parse("2011/10/07"));
    b1.setComment("スッキリわかる");
    books.add(b1);
    Book b2 = new Book();
    b2.setTitle("Python入門");
    b2.setPublishDate(f.parse("2019/06/11"));
    b2.setComment("カレーが食べたくなる");
    books.add(b2);
    Book b3 = new Book();
    b3.setTitle("C言語入門");
    b3.setPublishDate(f.parse("2018/06/21"));
    b3.setComment("ポインタも自由自在");
    books.add(b3);

    Collections.sort(books, new TitleComparator());

    for (Book b : books) {
      System.out.println(b.getTitle() + " " + f.format(b.getPublishData()) + " " + b.getComment());
    }

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
    // List<Account> list = new ArrayList<>();
    // Account a1 = new Account();
    // Account a2 = new Account();
    // Account a3 = new Account();
    // a1.number = 200;
    // a2.number = 100;
    // a3.number = 300;
    // a1.zandaka = 1000000;
    // a2.zandaka = 500000;
    // a3.zandaka = 100000;
    // list.add(a1);
    // list.add(a2);
    // list.add(a3);

    // System.out.println("ソート前：");
    // for (Account a : list) {
    // System.out.println(a.number);
    // }

    // Collections.sort(list); // 自然順序で並び替える

    // System.out.println("自然順序でのソート後：");
    // for (Account a : list) {
    // System.out.println(a.number);
    // }

    // Collections.sort(list, new ZandakaComparator()); // 残高順で並び替える

    // System.out.println("残高順でのソート後：");
    // for (Account a : list) {
    // System.out.println(a.number);
    // }
  }
}