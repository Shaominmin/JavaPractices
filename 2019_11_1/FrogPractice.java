//实现代码: 青蛙跳台阶问题(提示, 使用递归)
//一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法
import java.util.Scanner;
public class FrogPractice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入跳台的阶数(台阶数不为0):");
        int num = in.nextInt();  //接收一个正整数
        while(num == 0){
            System.out.println("请输入跳台的阶数(台阶数不为0):");
            num = in.nextInt();  //接收一个正整数
        }
        System.out.println("共有"+countOfJumping(num)+"种跳法");  //调用统计青蛙跳台方案数方法
    }
    //统计青蛙跳台方案数方法
    public static int countOfJumping(int num){
        int result = 0;
        if (num == 1){  //递归边界
            return 1;
        }
        if (num == 0){  //递归边界
            return 1;
        }
        result = countOfJumping(num-1) + countOfJumping(num-2);  //递归调用自身
        return result;
    }
}

