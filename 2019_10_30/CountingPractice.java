//编写程序数一下1到100的所有整数中出现多少个数字9
public class CountingPractice {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;  //计数器
        for (num = 1; num <= 100; num++) {
            //判断个位上是否有 9 
            if (num % 10 == 9) {
                count++;
            } 
            //判断十位上是否有 9
            if (num / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
