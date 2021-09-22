import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // System.out.println("止めるには「STOP」を入力してください");
    // System.out.println("カウントダウンを開始します");
    // PrintingThread t = new PrintingThread();
    // t.start();
    // String input = new Scanner(System.in).nextLine();
    // ▼カウントダウン中に、入力を受け付ける
    // System.out.println("入力文字列：" + input);
    // System.out.println("停止処理は未作成です");

    // ▼STOPが入力されたら、カウントダウンを中断
    // if (input.equals("STOP")) {
    // t.stopReq.set(true);
    // }
    // try {
    // t.join();
    // } catch (InterruptedException e) {
    // ;
    // }

    // ▼練習問題16-1
    new CountUpThread().start();
    new CountUpThread().start();
    new CountUpThread().start();
  }
}