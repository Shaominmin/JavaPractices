//打印1-100之间所有的素数
public class PrimePractice{
	public static void main (String []args){
		int i=0;
		int j=0;
		for (i=1;i<=100;i++){
			for(j=2;j<i;j++){
				if(i%j==0){
					break;
				}
			}
			if(j==i){
				System.out.println(i + " ");
			}
		}
	}
	
	
}