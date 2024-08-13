

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(FileReader in = new FileReader("text.txt");
            FileWriter out = new FileWriter("xxx.txt")) {
            int len;
            char[] buf = new char[3];
            while((len = in.read(buf))!=-1){
                out.write(buf, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
