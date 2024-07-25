import com.test.entity.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr=scanner.next().toCharArray();
        System.out.println(test(arr));
    }
    public static boolean test(char[] arr){
        int i=0,j= arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

}
