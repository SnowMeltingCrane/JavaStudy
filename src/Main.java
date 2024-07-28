import com.test.entity.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,4,2,5,3,7,6,9,8};
        Arrays.sort(arr, (o1, o2) -> o2-o1);
        System.out.println(Arrays.toString(arr));

        String t= Main.test("test");
        System.out.println(t);
    }

    public static <T> T test(T t){
        return t;
    }

}
