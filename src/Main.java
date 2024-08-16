
import com.test.entity.Student;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {



    public static void main(String[] args) throws InterruptedException {
        Object lock1 = new Object();
        Object lock2 = new Object();
        new Thread(()->{
            synchronized (lock1){
                try {
                    System.out.println("线程1运行中");
                    Thread.sleep(1000);
                    System.out.println("开始等待");
                    lock1.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程1运行结束");
            }
        }).start();

        new Thread(()->{
            synchronized (lock1){
                System.out.println("线程2运行中");
                try {
                    Thread.sleep(1000);
                    lock1.notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程2运行结束");
            }
        }).start();
    }
}
