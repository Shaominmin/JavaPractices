//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
public class RecursionPractice{
    public static void main(String[] args) {
        int num = 1234;
        recursionPrint(num);
    }
    public static void recursionPrint(int num) {
    	//将1234 --> 123
    	//123 --> 12
    	//12 --> 1 递归结束，进行模十打印
        if (num > 9) {
            recursionPrint(num / 10);           
        }
        System.out.print(num % 10 + " ");
    }
}
