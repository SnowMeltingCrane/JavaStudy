import com.test.entity.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test test = new Test("小明");
        Test.Inner inner = test.new Inner();
        inner.test();
    }

    private static boolean equals(int[] a,int[] b){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}