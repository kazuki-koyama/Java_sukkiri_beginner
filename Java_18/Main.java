// import java.sql.*;
import java.io.InputStream;
import java.net.URL;
// import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // FileWriter fw = new FileWriter("data.txt");
    // fw.write('そ');
    // fw.write('れ');
    // fw.write('で');
    // fw.write('は');
    // fw.close();

    // FileReader fr = new FileReader("data.txt");
    // int input = fr.read();
    // while (input != -1) {
    // System.out.print((char) input);
    // input = fr.read();
    // }
    // fr.close();

    URL u = new URL("https://book.impress.co.jp/");
    InputStream is = u.openStream();
    int i = is.read();
    while (i != -1) {
      char c = (char) i;
      System.out.print(c);
      i = is.read();
    }

    // Class.forName("org.h2.Driver");
    // String dburl = "jdbc:h2:~/test";
    // String sql = "INSERT INTO EMPLOYEES(NAME) VALUES('aoki')";
    // Connection conn = DriverManager.getConnection(dburl);
    // conn.createStatement().executeUpdate(sql);
    // conn.close();
  }
}
