import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // Writer fw = new FileWriter("rpgsave.properties");
    // Properties p = new Properties();
    // p.setProperty("heroName", "アサカ"); // データのセット
    // p.setProperty("heroHp", "62");
    // p.setProperty("heroMp", "45");
    // p.store(fw, "勇者の情報"); // ファイルへ書き出す
    // fw.close();
    // ▼読み取り
    Reader fr = new FileReader("c:\\rpgdata.properties");
    Properties p = new Properties();
    p.load(fr); // ファイル内容を読み取る
    String name = p.getProperty("heroName"); // キーを指定し値を取り出す
    String strHp = p.getProperty("heroHp");
    int hp = Integer.parseInt(strHp);
    System.out.println("勇者の名前：" + name);
    System.out.println("勇者のHP：" + hp);
    fr.close();
  }
}
