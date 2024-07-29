import com.test.collection.ArrayList;
import com.test.collection.LinkedList;
import com.test.collection.LinkedStack;
import com.test.entity.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack);
    }
}
