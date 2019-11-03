//输出1000-2000之间所有的素数
public class ConditionPractice{
	public static void main (String[]args){
		int year;
		for(year=1000;year<=2000;year++){
			if((year%400==0)||(year%4==0 && year%100 !=0)){
				System.out.println(year);
			}
		}
	}
}