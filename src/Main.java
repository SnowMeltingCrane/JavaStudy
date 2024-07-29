import com.test.collection.ArrayList;
import com.test.collection.LinkedList;
import com.test.entity.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 30; i++) {
            list.add("A"+i,0);
        }
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
