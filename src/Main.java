import com.test.collection.ArrayList;
import com.test.collection.LinkedList;
import com.test.collection.LinkedQueue;
import com.test.collection.LinkedStack;
import com.test.entity.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
