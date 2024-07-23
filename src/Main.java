import com.test.entity.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Main main = new Main();
        Study study = main::lbwnb;
        System.out.println(study.study());
    }

    public String lbwnb(){
        return  "卡布奇诺今犹在，不见当年倒茶人";
    }
}