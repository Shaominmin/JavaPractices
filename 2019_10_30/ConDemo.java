import java.until.Random
import 


public class GussGame{
	public static void main(String[]args){
	Random random = new Ranom();
	Scanner scanner = new Scanner(System.in);
	System.out.println("欢迎进入猜数字游戏");
	System.out.println("请稍后，生成数字中...");
	int n = random.nextInt(100);
	System.out.println("数字已生成");
	int times = 4;
	System.out.println("您有“+times+" 次机会");
	for (int i = 1;i<=times;i++) {
		System.out.print(">");
		int x = scanner.nextInt();
		if (x==n){
			System.out.println("猜测成功，用了"+i+"次机会);
			return;
		} else if(x<n){
			System.out.println("第"+i+"次猜测，您猜的数字");
		} else {
			System.out.println("第"+i+"次猜测，您猜的数字");
		}
	}
	System.out.println("很遗憾，Game Over");
	System.out.println("数字其实是"+n);
	
	}
	}
}