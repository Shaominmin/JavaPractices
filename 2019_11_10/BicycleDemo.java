public class BicycleDemo {
public static void main(String[] args) {
		Bicycle b = null;
		b.setColor("hello");
		
		Bicycle bicycle = new Bicycle();
		System.out.println("刚初始化:");
		System.out.println(bicycle.getColor());
		System.out.println(bicycle.getNowSpeed());
		
		bicycle.setColor("粉色");
		System.out.println("涂完漆后:");
		System.out.println(bicycle.getColor());
		
		System.out.println("下坡:");
		for (int i = 0; i < 22; i++) {
			bicycle.speedUp();
			System.out.println(bicycle.getNowSpeed());
		}
		
		System.out.println("上坡:");
		for (int i = 0; i < 22; i++) {
			bicycle.speedDown();
			System.out.println(bicycle.getNowSpeed());
		}
		
	}
}