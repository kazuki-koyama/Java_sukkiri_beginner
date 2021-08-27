public class Account {

  String accountNumber;
  int balance;

  // 文字列出力
  public String toString() {
    return "￥￥" + this.balance + "(口座番号：" + this.accountNumber + "）";
  }

  // 等価判定
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Account) {
      Account a = (Account) o;
      String an1 = this.accountNumber.trim();
      String an2 = a.accountNumber.trim();
      if (an1.equals(an2)) {
        return true;
      }
    }
    return false;
  }
}