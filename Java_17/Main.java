public class Main {

  public static void main(String[] args) {
    // 練習問題17-2
    // try {
    // String s = null;
    // System.out.println(s.length());
    // } catch (NullPointerException e) {
    // System.out.println("NullPointerException例外をcatchしました");
    // System.out.println("--スタックトレース（ここから）--");
    // e.printStackTrace();
    // System.out.println("--スタックトレース（ここまで）--");
    // }

    // 練習問題17-3
    try {
      int i = Integer.parseInt("三");
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException例外をcatchしました");
    }
  }
}