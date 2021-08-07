import org.w3c.dom.Text;

public class Main {
  public static void main(String[] args) {
    // introduceOneself();
    String title = "お誘い";
    String address = "user@example.com";
    String text = "今度、飲みに行きませんか？";
    email(title, address, text);
  }

  // 練習問題5-1
  // public static void introduceOneself() {
  // String name = "Minato";
  // int age = 29;
  // double height = 184.5;
  // char zodiac = '申';
  // System.out.println("私の名前は、" + name + "です");
  // System.out.println(zodiac + "年生まれの" + age + "歳です");
  // System.out.println("身長は、" + height + "cmあります");
  // }

  // 練習問題5-2
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}