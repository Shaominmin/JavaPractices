// 递归求 1 + 2 + 3 + ... + 10
public class ShuliePractice{
    public static void main(String[] args) {
        int num=10;  
        System.out.println(add(num));
    }

    public static int add(int num){
        if(num == 1){
            return 1;
        }else{
            return num +add(num - 1);
        }
    }
}
