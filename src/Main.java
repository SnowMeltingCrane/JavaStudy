
import com.test.entity.Student;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("text.txt"));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("text.txt"))){
            Student student = new Student();
            student.name="小明";
            student.age=18;
            out.writeObject(student);
            System.out.println(in.readObject());

        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
