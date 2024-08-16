import com.test.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<Student> clazz = Student.class;
        Constructor<Student> constructor = clazz.getConstructor(String.class, int.class);
        Student student = constructor.newInstance("小明", 18);
        System.out.println(student);
        Method test = clazz.getMethod("getName");
        System.out.println(test.invoke(student));
    }
}
