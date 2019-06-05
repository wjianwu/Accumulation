package file_operating;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author wjianwu 2019/4/18 11:13
 */
public class ReadFile {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\wjianwu\\Desktop\\cal.txt");
        // 按行读取
        try {
            List<String> lines = Files.readAllLines(path);
            StringBuilder sb = new StringBuilder();
            for (String temp : lines) {
                sb.append(temp).append("\n");
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 字节读取
        try {
            String string = new String(Files.readAllBytes(path));
            System.out.println(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
