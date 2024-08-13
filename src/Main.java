

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("火男.mp4");
        try(FileInputStream in = new FileInputStream(file);
            FileOutputStream out = new FileOutputStream("xxx.mp4")){
            int len;
            byte[] buf = new byte[1024];
            long total = file.length(),sum = 0;
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
                sum += len;
                System.out.println("文件已拷贝"+(sum * 100 / total)+ "%");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
