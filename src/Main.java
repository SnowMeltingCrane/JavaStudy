import com.test.collection.*;
import com.test.collection.ArrayList;
import com.test.collection.LinkedList;
import com.test.entity.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        TreeNode<Character> a = new TreeNode<>('a');
        TreeNode<Character> b = new TreeNode<>('b');
        TreeNode<Character> c = new TreeNode<>('c');
        TreeNode<Character> d = new TreeNode<>('d');
        TreeNode<Character> e = new TreeNode<>('e');
        TreeNode<Character> f = new TreeNode<>('f');

        a.left= b;
        a.right= c;
        b.left= d;
        b.right= e;
        c.right=f;

        HashTable<String> hashTable = new HashTable();
        String test = "AAA";
        System.out.println(hashTable.contains(test));
        hashTable.put(test);
        System.out.println(hashTable.contains(test));

    }

    public static void levelOrder(TreeNode<Character> root) {
        LinkedQueue<TreeNode<Character>> queue = new LinkedQueue<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode<Character> current = queue.poll();
            System.out.print(current.element+" ");
            if(current.left != null) {
                queue.offer(current.left);
            }
            if(current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    public static void preOrder(TreeNode<Character> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.element+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode<Character> root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.element+" ");
        inOrder(root.right);
    }

    public static void postOrder(TreeNode<Character> root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.element+" ");
    }
}
