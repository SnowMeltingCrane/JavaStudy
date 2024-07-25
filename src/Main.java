import com.test.entity.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hanoi('A','B','C',3);
    }
    public static void hanoi(char a, char b, char c,int n) {
        if(n==1)
            System.out.println(a+ "--->"+c);
        else{
            hanoi(a,c,b,n-1);
            System.out.println(a+ "--->"+c);
            hanoi(b,a,c,n-1);
        }
    }
}
