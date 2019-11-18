//设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。
public class StudentPractice{
	private String name;
	private String sex;
	private int age;
	public StudentPractice(String num,String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void college(){
		System.out.println(this.name+"西安工业大学");
	}
	public void major(){
		System.out.println(this.name+"计算机科学与技术");
	}
	public void grade(){
		System.out.println(this.name+"大三");
	}
	public void studentshow(){
		System.out.println("我的名字是"+name+"我今年"+age);
	}
	
}