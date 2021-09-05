// package packageA;

public enum AccountType {
  FUTSU, TOUZA, TEIKI;
}

Collections.sort(list, new Comparator<Account>() {
  public int compare(Account x, Account y) {
    return (x.zandaka - y.zandaka);
  }
}
