import com.test.entity.*;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("我是try");
            int[] arr={1,2,3,4,5};
            arr[-1]= 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("我是catch");
        }finally {
            System.out.println("我是finally");
        }

    }

    private static int test(int a ,int b){
        if(b==0)
            throw new RuntimeException("除数不能为0");
        return a / b;
    }
}
