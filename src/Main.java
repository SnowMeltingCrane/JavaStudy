import com.test.entity.*;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5,6,4,2,5,8,5,6,2,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Main.search(arr, 7));
    }

    public static int search(int[] arr,int a) {
       int left = 0,right = arr.length-1;
       while(left <= right) {
           int mid = (left+right)/2;//会变的东西要写在循环体内
           if(arr[mid] < a)
               left = mid+1;
           else if(arr[mid] > a)
               right = mid-1;
           else
               return mid;
       }
       return -1;
    }
}
