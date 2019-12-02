package instanceof_exam;

public class Main {
    public static void main(String[] args) {
        A c = new C();
        A b = new B();
        A a = new A();

        if (c instanceof B) {
            B x = (B)c;
        } else {
            // 不可以
        }

        // r引用 instanceof C类型
        // r引用指向的对象能否被 C类型 的引用指向
        System.out.println(c instanceof B);
        System.out.println(b instanceof B);
        System.out.println(a instanceof B);
    }
}
