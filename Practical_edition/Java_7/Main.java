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
    // Reader fr = new FileReader("c:\\rpgdata.properties");
    // Properties p = new Properties();
    // p.load(fr); // ファイル内容を読み取る
    // String name = p.getProperty("heroName"); // キーを指定し値を取り出す
    // String strHp = p.getProperty("heroHp");
    // int hp = Integer.parseInt(strHp);
    // System.out.println("勇者の名前：" + name);
    // System.out.println("勇者のHP：" + hp);
    // fr.close();

    // 練習問題7-1
    // try (Reader fr = new FileReader("pref.properties");) {
    // Properties p = new Properties();
    // p.load(fr);
    // System.out.println(p.getProperty("aichi.capital") + ":" +
    // p.getProperty("aichi.food"));
    // fr.close();
    // } catch (Exception e) {
    // System.out.println("ファイル処理に失敗しました");
    // }

    // 練習問題7-2
    // ResourceBundle rb = ResourceBundle.getBundle("pref");
    // System.out.println(rb.getString("aichi.capital") + ":" +
    // rb.getString("aichi.food"));

    // 練習問題7-3
    Employee tanaka = new Employee();
    tanaka.name = "田中太郎";
    tanaka.age = 41;
    Department soumubu = new Department();
    soumubu.name = "総務部";
    soumubu.leader = tanaka;
    FileOutputStream fos = new FileOutputStream("company.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(soumubu);
    oos.flush();
    oos.close();
  }
}
