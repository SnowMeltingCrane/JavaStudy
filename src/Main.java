
import com.test.entity.Student;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static int i;

    public static synchronized void add(){
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        new Thread(()->{
            for (int j = 0; j < 100000; j++) {
                add();
            }
        }).start();

        new Thread(()->{
            for (int j = 0; j < 100000; j++) {
                add();
            }
        }).start();

        new Thread(()->{
            synchronized(Main.class){
                for (int j = 0; j < 100000; j++) {
                    i++;
                }
            }
        }).start();

        Thread.sleep(1000);
        System.out.println(i);
    }
}
