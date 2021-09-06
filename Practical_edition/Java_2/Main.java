// package packageA;
// import static packageA.AccountType.FUTSU;

public class Main {
  public static void main(String[] args) {
    // 練習問題2-2
    StrongBox<String> sb = new StrongBox<>(KeyType.PADLOCK);
    sb.put("鍵が開きました");
    String rock = "";
    for (int i = 0; i < 1024; i++) {
      rock = sb.get();
    }
    if (rock != null) {
      System.out.println(rock);
    } else {
      System.out.println("鍵は開いていません");
    }
    // Account a1 = new Account("1732050", AccountType.FUTSU);
    // System.out.println("口座番号は" + a1.getAccountNo() + "です");
    // System.out.println("口座種別は" + a1.getAccountType() + "です");
  }
}
