import java.sql.*;

public class Main {
  public static void main(String[] args) {
    // ▼DB操作サンプル
    // try {
    // Class.forName("org.h2.Driver");
    // } catch (ClassNotFoundException e) {
    // throw new IllegalStateException("ドライバのロードに失敗しました");
    // }
    // Connection con = null;
    // try {
    // con = DriverManager.getConnection("jdbc:h2:~/rpgdb"); // DB接続
    // PreparedStatement pstmt = con.prepareStatement
    // ("SELECT * FROM MONSTERS WHERE NAME = ?");
    // pstmt.setString(1, "ゴブリン");
    // ResultSet rs = pstmt.executeQuery();
    // if (rs.next()) {
    // System.out.println("ゴブリンのHPは" + rs.getInt("HP"));
    // } else {
    // System.out.println("ゴブリンはありませんでした");
    // }
    // rs.close();
    // pstmt.close(); // 後片付け

    // } catch (SQLException e) {
    // e.printStackTrace();
    // } finally {
    // if (con != null) {
    // try {
    // con.close();
    // } catch (SQLException e) {
    // e.printStackTrace();
    // }
    // }
    // }

    // 練習問題9-2
    System.out.println("1円以上のアイテム一覧表を表示します");
    ArrayList<Item> items = ItemsDAO.findByMinimumPrice(1);
    for (Item item : items) {
      System.out.printf("%10s%4d%4d", item.getName(), item.getPrice(), item.getWeight());
    }
  }
}
