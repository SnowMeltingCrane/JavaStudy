import com.test.entity.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Score<? extends Number> score1= new Score<>("","",10);
        Score<? super Integer> score2= new Score<>("","",10);

        score1.setValue(10);
        score2.setValue(10);
    }

    public static <T> T test(T t){
        return t;
    }

}
