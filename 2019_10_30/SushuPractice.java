import java.util.Scanner;
//判定一个数字是否是素数
public class SushuPractice{
	public static int primeNum(int a){
		int b = 0;
		for (int i=2;i<a;i++){
			if(a%i==0){
				System.out.println(a+"不是素数");
				b++;
				break;
			}
			
		}
		if(b==0){
			System.out.println(a+"是素数");
		}
		return a;
	}
	public static void main (String []args){
		System.out.println("请输入需要判断的数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		SushuPractice.primeNum(num);

	}
	
}