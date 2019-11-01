public class JavaPracticed {
	public static void main(String[] args) {
		/*
		String action = "你好";
		for (int i = 0; i < args.length; i++) {
			System.out.println(action + " \"" + args[i] + "\"");
		}
		*/
		/*
		if (args.length < 2) {
			System.out.println("请输入两个数字");
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int result = x + y;
		// 3	5
		// "3 + 5 相加的结果是 8”
		String message = String.format("%d + %d 相加的结果是 %d", x, y, result);
		System.out.println(message);
		System.out.format("%d + %d 相加的结果是 %d%n", x, y, result);
		System.out.printf("%d + %d 相加的结果是 %d%n", x, y, result);
		System.out.println(
			"" + x + " + " + y + " 相加的结果是 " + result
		);
		System.out.print(
			"" + x + " + " + y + " 相加的结果是 " + result
		);
		System.out.println("我是跟班的");
		*/
		
		
		/*
		System.out.println(x);
		{
			int x = 10;
			System.out.println(x);
		}
		System.out.println(x);
		*/
		
		/*
		String x = "我是字符串";
		System.out.println(x);
		{
			int x = 10;
			System.out.println(x);
		}
		*/
		
		
		/*
		final int x = 10;
		x = 9;
		*/
		
		/*
		final int x;
		x = 10;
		x = 9;
		*/
		
		String s = "12345";
		System.out.println(Integer.parseInt(s));
		System.out.println(Long.parseLong(s));
		System.out.println(Double.parseDouble(s));
		System.out.println("===================");
		int x = 38;
		long y = 39L;
		double z = 3.1415;
		System.out.println(String.valueOf(x));
		System.out.println(String.valueOf(y));
		System.out.println(String.valueOf(z));
	}
}



