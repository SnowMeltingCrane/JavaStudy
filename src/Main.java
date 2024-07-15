import com.test.entity.Person;
import com.test.entity.Student;
import com.test.entity.Study;
import com.test.entity.Worker;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student("小明",18,"男");
        Student clone=(Student) student.clone();

        System.out.println(student);
        System.out.println(clone);
        System.out.println(student==clone);
    }
}