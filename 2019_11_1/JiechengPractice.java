import java.util.Scanner;
//用递归的方法求n的阶乘
public class JiechengPractice {
 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); //构建一个输入实例
        int n = input.nextInt();                //输入n的值
//    n的阶乘的值为：factorial(n);                //用递归函数求解n的阶乘
        System.out.println(+ n +"的阶乘为： " + factorial(n));
    }
 
    public static int factorial(int n){         //阶乘求解函数
        if(n == 0){                             //判断传进来的n是否为0，若为零返回阶乘为1
            return 1;
        }
        return n*factorial(n-1);             //重新调用函数，继续判断n-1是否为零，
    }                                          //若不为0则return值为n*(n-1)*factorial(n-1-1),直到n=0，跳出函数
}