import org.w3c.dom.Text;

public class Main {
  public static void main(String[] args) {
    // introduceOneself();

    // String title = "お誘い";
    // String address = "user@example.com";
    // String text = "今度、飲みに行きませんか？";
    // email(address, text);

    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積：" + triangleArea + "平方cm");
    double circleArea = calcCircleArea(5.0);
    System.out.println("円の面積：" + circleArea + "平方cm");
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
  // public static void email(String title, String address, String text) {
  // System.out.println(address + "に、以下のメールを送信しました");
  // System.out.println("件名：" + title);
  // System.out.println("本文：" + text);
  // }

  // 練習問題5-3
  // public static void email(String address, String text) {
  // System.out.println(address + "に、以下のメールを送信しました");
  // System.out.println("件名：無題");
  // System.out.println("本文：" + text);
  // }

  // 練習問題5-4
  public static double calcTriangleArea(double bottom, double height) {
    double area = (bottom * height) / 2;
    return area;
  }

  public static double calcCircleArea(double radius) {
    double area = radius * radius * 3.14;
    return area;
  }
}