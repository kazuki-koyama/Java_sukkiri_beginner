public class Main {

  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト");
    Matango m = new Matango('A');
    PoisonMatango p = new PoisonMatango('B');
    m.attack(h1);
    System.out.println("残りHP" + h1.hp + "ポイント");
    p.attack(h1);
    System.out.println("残りHP" + h1.hp + "ポイント");
  }
}