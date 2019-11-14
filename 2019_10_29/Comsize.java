public class Comsize{
	public static void main(String[]args){
        int a=5;
        int b=89;
        int c=-76;
        int tmp;
        if(a>b){
            tmp=a;
            a=b;
            b=tmp;
        }
        if(a>c){
            tmp=a;
            a=c;
            c=tmp;
        }
        if(b>c){
            tmp=b;
            b=c;
            c=tmp;
        }
        System.out.println("最大值="+c+"\t"+"最小值="+a);
    }
}
