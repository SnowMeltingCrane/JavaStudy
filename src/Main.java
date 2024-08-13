

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("火男.mp4");
            FileOutputStream out = new FileOutputStream("xxx.mp4")){
            int len;
            byte[] buf = new byte[1024];
            while((len = in.read(buf))!=-1){
                out.write(buf, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
