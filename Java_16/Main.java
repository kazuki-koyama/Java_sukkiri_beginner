import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Map<String, Integer> prefs = new HashMap<String, Integer>();
    // prefs.put("京都府", 255);
    // prefs.put("東京都", 1261);
    // prefs.put("熊本県", 182);
    // for (String key : prefs.keySet()) {
    // int value = prefs.get(key);
    // System.out.println(key + "の人口は、" + value);
    // }

    // 練習問題16-2
    // Hero h1 = new Hero("斎藤");
    // Hero h2 = new Hero("鈴木");
    // List<Hero> heroes = new ArrayList<Hero>();
    // heroes.add(h1);
    // heroes.add(h2);
    // for (Hero h : heroes) {
    // System.out.println(h.getName());
    // }

    // 練習問題16-3
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
    heroes.put(h1, 3);
    heroes.put(h2, 7);
    for (Hero key : heroes.keySet()) {
      int value = heroes.get(key);
      System.out.println(key.getName() + "が倒した敵=" + value);
    }
  }
}
