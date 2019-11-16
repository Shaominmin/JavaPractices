//求两个正整数的最大公约数
import java.util.Scanner;
public class MaxcdPractice{
	public static int fun (int a,int b){
		int tmp =0; //保存余数
		while (a%b!=0){
			tmp = a%b;
			a=b;
			b=tmp;
		}
		return b;
	}
	public static void main(String[]args){
		System.out.println("请输入两个数：");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("ret="+fun(a,b));
	}
}