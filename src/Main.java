
import com.test.entity.Student;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            System.out.println("线程1开始运行");
            for (int i = 0; i < 50; i++) {
                if(i%5==0){
                    System.out.println("让位");
                    Thread.yield();
                }
                System.out.println("线程1打印:"+i);
            }
            System.out.println("线程1结束");
        });
        Thread t2 = new Thread(()-> {
            System.out.println("线程2开始运行");
            for (int i = 0; i < 50; i++) {
                System.out.println("线程2打印:"+i);
            }
            System.out.println("线程2结束");
        });
        t1.start();
        t2.start();
    }
}
