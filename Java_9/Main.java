public class Main {

  /*
   * // public static void main(String[] args) { Sword s = new Sword(); s.name =
   * "炎の剣"; s.damage = 10; Hero h1 = new Hero("ミナト"); Hero h2 = new Hero(); Wizard
   * w = new Wizard("スガワラ"); w.heal(h1); w.heal(h2); h.sword = s;
   * System.out.println(h.name + "は" + h.sword.name + "で攻撃した！"); }
   */

  // 練習問題9-2
  public static void heal(int hp) {
    hp += 10;
  }

  public static void heal(Thief thief) {
    thief.hp += 10;
  }

  public static void main(String[] args) {
    int baseHp = 25;
    Thief t = new Thief("アサカ", baseHp);
    System.out.println(baseHp + " : " + t.hp);
    heal(baseHp);
    heal(t);
    System.out.println(baseHp + " : " + t.hp);
  }

}