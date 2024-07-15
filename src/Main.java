import com.test.entity.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student("小明",18,"男");
        student.setStatus(Status.RUNNING);
        System.out.println(student.getStatus().getName());
    }
}