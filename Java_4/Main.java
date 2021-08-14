public class Main {
  public static void main(String[] args) {
    // int[] seq = new int [10];
    // char[] base = {'A', 'T', 'G', 'C'};

    // for (int i = 0; i < seq.length; i++) {
    //   seq[i] = new java.util.Random().nextInt(4);
    //   System.out.println(base[seq[i]] + " ");
    // }

    // 練習問題4-4
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int n : numbers) {
      if(n == input) {
        System.out.println("アタリ!");
      }
    }
  }
}