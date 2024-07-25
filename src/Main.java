import com.test.entity.*;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,9,10,46,98};
        System.out.println(binarySearch(arr,0,arr.length-1,46));
    }
    public static int test(int n){
        if(n==0||n==1)
            return 1;
        return test(n-1) + test(n-2);
    }

    private static int binarySearch(int[] arr, int left ,int right,int target){
        if(left>right) return -1;
        int mid = (left + right)/2;
        if(arr[mid]>target)
            return binarySearch(arr,left,mid-1,target);
        else if(arr[mid]<target)
            return binarySearch(arr,mid+1,right,target);
        else
            return mid;
    }
}
