import com.test.entity.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Study study = (a) -> {
            System.out.println("我是lambda表达式");
            return a;
        };
        System.out.println(study.study(20));

        Study study1 = (a) -> a;
        System.out.println(study1.study(1));
    }
}