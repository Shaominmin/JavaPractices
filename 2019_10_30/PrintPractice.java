//输出一个整数的每一位
public class PrintPractice{
    public static void main(String[] args) {
        int a=8956;
        print(a);
    }
    
    //递归
    public static void print(int a){ 
        if(a>9){
            print(a/10);
        }
    System.out.println(a % 10 +"");
    }
}
