import java.util.Scanner;
import java.io.*;
import com.beauty.*;

public class Main {
  public static void main(String[] args) throws IOException{
    new FontOnceTo().word("请将文件放入Launcher目录,完成后按回车键继续");
    new Control().ifEnter();
    new FontOnceTo().word("请输入文件名称(带上扩展名) 如:MC.exe");
    String path = "/storage/emulated/0/Android/data/com.cjtecapp.javaide/files/CJ_IDE/JAVAProject/FileGO/launcher/";
    String completePath = new Scanner(System.in).nextLine();
    FileInputStream fps = new FileInputStream(path + completePath);
  }
}
