
import com.test.entity.Student;
import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static final Queue<Object> queue = new LinkedList<>();

    public static void main(String[] args)  {
        new Thread(Main::cook,"蔡徐坤").start();
        new Thread(Main::cook,"卢本伟").start();
        new Thread(Main::eat,"hanghang").start();
        new Thread(Main::eat,"卑劣的凡").start();
        new Thread(Main::eat,"唐启华").start();
    }

    private static void cook(){
        while(true){
            try {
                Thread.sleep(3000);
                synchronized (queue) {
                    queue.offer(new Object());
                    String name = Thread.currentThread().getName();
                    System.out.println("厨师:"+name+"在"+new Date()+"制作了一份菜品");
                    queue.notifyAll();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void eat(){
        while(true){
            try{
                synchronized (queue) {
                    while(queue.isEmpty()){
                        queue.wait();
                    }
                    queue.poll();
                    String name = Thread.currentThread().getName();
                    System.out.println("顾客:"+name+"在"+new Date()+"开始享用一道菜");
                }
                Thread.sleep(4000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
