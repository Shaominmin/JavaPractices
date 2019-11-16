 //写一个递归方法，输入一个非负整数，返回组成它的数字之和
 import java.util.Scanner;

public class SumPractice{
    public static void main(String[] args) {
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个非负整数：");
        int num = input.nextInt(); //接收输入的整数
        sum = integerSum(num);
        System.out.println("组成" + num + "的数字之和为:" + sum);
    }

    public static int  integerSum(int num){
        if(num < 10){
            return num;
        }else{
            return num % 10 + integerSum(num/10);
        }
    }
}

 