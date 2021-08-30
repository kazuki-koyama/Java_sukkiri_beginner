import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
  // public static void main(String[] args) {
  /*
   * Date now = new Date(); System.out.println(now);
   * System.out.println(now.getTime()); Date past = new Date(1600705425827L);
   * System.out.println(past);
   */

  // Calendar c = Calendar.getInstance();
  // // 6つのint値からDateインスタンスを生成
  // c.set(2019, 8, 22, 1, 23, 45);
  // c.set(Calendar.MONTH, 9); /* 月を9（10月）に変更 */
  // Date d = c.getTime();
  // System.out.println(d);
  // // Dateインスタンスからint値を生成
  // Date now = new Date();
  // c.setTime(now);
  // int y = c.get(Calendar.YEAR); /* 年を取り出す */
  // System.out.println("今年は" + y + "年です");
  // }

  public static void main(String[] args) throws Exception {
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // 文字列からDateインスタンスを生成
    Date d = f.parse("2020/09/22 01:23:45");
    System.out.println(d);
    // Dateインスタンスから文字列を生成
    Date now = new Date();
    String s = f.format(now);
    System.out.println("現在は" + s + "です");
  }
}
