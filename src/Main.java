import com.test.entity.Person;
import com.test.entity.Student;
import com.test.entity.Worker;

public class Main {
    public static void main(String[] args) {
        Person p1=new Student("小明",18,"男");
        Person p2=new Worker("小明",18,"男");
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        p1.test();
        p2.test();
    }
}