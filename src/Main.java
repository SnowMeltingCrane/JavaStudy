import com.test.collection.ArrayList;
import com.test.entity.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add("A"+i,i);
        }
        System.out.println(list.get(3));
        System.out.println(list);

    }
}
