public class Main {

  public static void main(String[] args) {
    /*
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    */
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "アサカ";
    h2.hp = 100;
    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    // h.sword = s;
    // System.out.println(h.name + "は" + h.sword.name + "で攻撃した！");
  }
}