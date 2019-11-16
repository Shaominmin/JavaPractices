//计算1/1-1/2+1/3-1/4+1/5......+1/99-1/100的值
public class MathPractice{
    public static void main(String[] args){
        double n=0.0;
        double i=-1.0;
        double tem=0.0;
        double sum=0.0;
        for(n=1;n<101;n++){
            i=-i;
            tem=(1/n)*i;
            sum=sum+tem;
        }
        System.out.println(sum);
    }
}
