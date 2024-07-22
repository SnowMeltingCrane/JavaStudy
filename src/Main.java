import com.test.entity.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student() {
            @Override
            public void test() {
                System.out.println("我是匿名内部类1");
            }
        };
        student.test();

        Study study = new Study() {
            @Override
            public void study() {
                System.out.println("我是匿名内部类2");
            }
        };
        study.study();
    }
}