//写一个函数返回参数二进制中1的个数，比如：15 0000 1111 4个1
import java.util.Scanner;
public class TextPractice {
    public static void fun(int num) {
        int count = 0;     //保存“1”个数的数
        while (num >0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        System.out.println("有" + count + "个1");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字：");  //从控制台输入
        int i = scan.nextInt();
        fun(i);    //调用方法
    }
}
