public class Hero {
  String name;
  int hp = 100;

  public Hero(String name) {
    this.name = name;
  }

  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージをあたえた!");
  }

  public final void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は転んだ!");
    System.out.println("5のダメージ");
  }

  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
}
