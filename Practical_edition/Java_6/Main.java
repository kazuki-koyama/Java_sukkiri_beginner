import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("rpgsave.dat", true);
    fw.write('A');
    fw.flush();
    fw.close();

    FileReader fw2 = new FileReader("rpgsave.dat");
    System.out.println("すべてのデータを読んで表示します");
    int i = fw2.read();
    while (i != -1) {
      char c = (char) i;
      System.out.print(c);
      i = fw2.read();
    }
    System.out.println("ファイルの末尾に到達しました");
    fw2.close();
  }
}
