import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
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
    // try {
    //   int i = Integer.parseInt("三");
    // } catch (NumberFormatException e) {
    //   System.out.println("NumberFormatException例外をcatchしました");
    // }

    // 練習問題17-4
    System.out.println("プログラムが起動しました");
    throw new IOException();
  }
}