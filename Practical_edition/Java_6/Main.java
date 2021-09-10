import java.io.*;
import java.nio.file.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // ▼書き込み
    // try (FileWriter fw = new FileWriter("rpgsave.dat", true);) {
    // fw.write('A');
    // fw.flush();
    // } catch (IOException e) {
    // System.out.println("ファイル書き込みエラーです");
    // }

    // ▼読み取り
    // FileReader fw = new FileReader("rpgsave.dat");
    // System.out.println("すべてのデータを読んで表示します");
    // int i = fw.read();
    // while (i != -1) {
    // char c = (char) i;
    // System.out.print(c);
    // i = fw.read();
    // }
    // System.out.println("ファイルの末尾に到達しました");
    // fw.close();

    // 練習問題6-1
    // String inFile = args[0];
    // String outFile = args[1];
    // FileInputStream fis = new FileInputStream(inFile);
    // FileOutputStream fos = new FileOutputStream(outFile);
    // int i = fis.read();
    // while (i != -1) {
    // fos.write(i);
    // i = fis.read();
    // }
    // fos.flush();
    // fos.close();
    // fis.close();

    // ▼別解(java.nio.file.Filesクラス)
    Files.copy(Paths.get(args[0]), Paths.get(args[1]));
  }
}
