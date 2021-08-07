public class Main {
  public static void main(String[] args) {
    introduceOneself();
  }

  // 練習問題5-1
  public static void introduceOneself() {
    String name = "Minato";
    int age = 29;
    double height = 184.5;
    char zodiac = '申';
    System.out.println("私の名前は、" + name + "です");
    System.out.println(zodiac + "年生まれの" + age + "歳です");
    System.out.println("身長は、" + height + "cmあります");
  }
}