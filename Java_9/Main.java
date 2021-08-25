public class Main {

  public static void main(String[] args) {
    /*
     * Sword s = new Sword(); s.name = "炎の剣"; s.damage = 10;
     */
    Hero h1 = new Hero("ミナト");
    Hero h2 = new Hero();
    Wizard w = new Wizard("スガワラ");
    w.heal(h1);
    w.heal(h2);
    // h.sword = s;
    // System.out.println(h.name + "は" + h.sword.name + "で攻撃した！");
  }
}