
// import java.util.Date;
// import java.util.Calendar;
// import java.text.SimpleDateFormat;
// import java.time.*;

public class Main {
  public static void main(String[] args) {
    // 練習問題15-1
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      sb.append(i + 1).append(",");
    }
    String s = sb.toString();
    String[] array = s.split(",");
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

    // // Instantの生成
    // Instant i1 = Instant.now();

    // // Instantとlong値との相互変換
    // Instant i2 = Instant.ofEpochMilli(1600705425827L);
    // long l = i2.toEpochMilli();

    // // ZonedDateTimeの生成方法
    // ZonedDateTime z1 = ZonedDateTime.now();
    // ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6,
    // ZoneId.of("Asia/Tokyo"));

    // // InstantとZoneDateTimeの相互変換
    // Instant i3 = z2.toInstant();
    // ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

    // // ZonedDateTimeの利用方法
    // System.out.println("東京:" + z2.getYear() + z2.getMonth() +
    // z2.getDayOfMonth());
    // System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() +
    // z3.getDayOfMonth());
    // if (z2.isEqual(z3)) {
    // System.out.println("これらは同じ瞬間を指しています");
    // }
  }

  // public static void main(String[] args) throws Exception {
  // SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
  // // 文字列からDateインスタンスを生成
  // Date d = f.parse("2020/09/22 01:23:45");
  // System.out.println(d);
  // // Dateインスタンスから文字列を生成
  // Date now = new Date();
  // String s = f.format(now);
  // System.out.println("現在は" + s + "です");
  // }
}
