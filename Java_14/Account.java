public class Account {

  String accountNumber;
  int balance;

  // 文字列出力
  public String toString() {
    return "￥￥" + this.balance + "(口座番号：" + this.accountNumber + "）";
  }
}