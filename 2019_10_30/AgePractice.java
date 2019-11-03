public class AgePractice{
	public static void main(String[]args){
		//根据年龄，来打印出当前年龄的人是少年（低于18），青年（19-28），中年（29-55），老年（56以上）
		int a=20;
		if (a<=18 && a>=0){
			System.out.println("少年");
		}else if (a<=28 && a>=19 ){
			System.out.println("青年");
		}else if (a<=55 && a>=29){
			System.out.println("中年");
		}else if (a>=56){
			System.out.println("老年");
		}else {
			System.out.println("你的输入有误！");
		}
	}	
}