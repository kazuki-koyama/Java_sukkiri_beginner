public class Main { 
  public static void main(String[] args) {
    // 練習問題3-3
    // int isHungry = 1;
    // String food = "おにぎり";
    // System.out.println("こんにちは");
    //   if (isHungry == 0) {
    //     System.out.println("お腹がいっぱいです");
    //   } else {
    //     System.out.println("はらぺこです");
    //   }
    //   if (isHungry == 1) {
    //     System.out.println(food + "をいただきます");
    //   }
    //   System.out.println("ごちそうさまでした");
    // }

    // 練習問題3-4
    System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch(selected) {
      case 1:
        System.out.println("検索");
        break;
      case 2:
        System.out.println("登録");
        break;
      case 3:
        System.out.println("削除");
        break;
      case 4:
        System.out.println("変更");
        break;
    }
  }
}
