//求出0-999之间的“水仙花数”并输出
public class ShuixianhuaPractice{
	public static void main(String[] args){
		// for(int i=1; i<=9; i++)
			// for(int j=0; j<=9; j++)
				// for(int k=0; k<=9; k++)
					// if(i*i*i+j*j*j+k*k*k == 100*i+10*j+k)
						// System.out.println(i*100+j*10+k+" ");
  


        int i;
        int a, b, c;
        for (i = 100; i < 1000; i++){
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100 % 10;
               if (i == a * a * a + b * b * b + c * c * c){
                  System.out.println(i);
            }
        }
    }
}