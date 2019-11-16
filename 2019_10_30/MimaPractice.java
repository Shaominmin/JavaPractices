//java编写代码模拟三次密码输入的场景。最多能输入三次密码,密码正确,提示“登录成功“，
//密码错误，可以重新输入，最多输入三次。三次均错，则提示退出程序
import java.util.Scanner;
public class MimaPractice{
   public static void main(String[] args){
         System.out.println("欢迎使用");
         for(int i=0;i<3;i++){
             System.out.println("请输入密码：");
             Scanner in = new Scanner(System.in);
             String password = in.next();
             if(password.equals("123456")){
                 System.out.println("密码正确，登陆成功！");
                 break;
             }
             else if(2-i==0){
                 System.out.println("三次均错，退出程序！");
			 }else{
				 System.out.println("密码错误，请重新输入，你还有"+(2-i)+"次输入机会");
			 }
         }
    }
}

