import java.io.*;
import java.net.*;
import com.fasterxml.jackson.databind.*;

public class Main {
  public static void main(String[] args) throws IOException {
    // ▼Webページ読み込み(URLクラス)
    // URL url = new URL("https://dokojava.jp");
    // InputStream is = url.openStream();
    // InputStreamReader isr = new InputStreamReader(is);
    // int i = isr.read();
    // while (i != -1) {
    // System.out.print((char) i);
    // i = isr.read();
    // }
    // isr.close();

    // ▼Webページ読み込み(Socketクラス)
    // Socket sock = new Socket("dokojava.jp", 80);
    // InputStream is = sock.getInputStream();
    // OutputStream os = sock.getOutputStream();
    // os.write("GET /index.html HTTP/1.0\r\n".getBytes());
    // os.write("\r\n".getBytes());
    // os.flush();
    // InputStreamReader isr = new InputStreamReader(is);
    // int i = isr.read();
    // while (i != -1) {
    // System.out.print((char) i);
    // i = isr.read();
    // }
    // sock.close();

    // ▼サーバプログラム
    // System.out.println("起動完了");
    // ServerSocket svSock = new ServerSocket(39648);
    // Socket sock = svSock.accept();
    // System.out.println(sock.getInetAddress() + "から接続");
    // sock.getOutputStream().write("WELCOME".getBytes());
    // sock.getOutputStream().flush();
    // sock.close();

    // 練習問題8-1
    // URL url = new URL("https://dokojava.jp/favicon.ico");
    // InputStream is = url.openStream();
    // OutputStream os = new FileOutputStream("dj.ico");
    // int i = is.read();
    // while (i != -1) {
    // os.write((byte) i);
    // i = is.read();
    // }
    // is.close();
    // os.flush();
    // os.close();

    // 練習問題8-2
    // Socket sock = new Socket("smtp.example.com", 60025);
    // OutputStream os = sock.getOutputStream();
    // os.write("HELO example.com\r\n".getBytes());
    // os.flush();
    // sock.close();

    // 練習問題8-3
    String url = "https://api.github.com/users/miyabilink";
    HttpClient client = HttpClient.newBuilder()
      .version(Version.HTTP_1_1)
      .followRedirects(Redirect.NORMAL)
      .build();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(url))
      .header("Accept", "application/vnd.github.v3+json")
      .GET()
      .build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    String body = res.body();
    int status = res.statusCode();
    if (status == 200) {
      ObjectMapper mapper = new ObjectMapper();
      JsonNode root = mapper.readTree(body);
      String blog = root.get("blog").textValue();
      System.out.println(blog);
    } else {
      System.out.println("ERROR: " + status);
    }
  }
}