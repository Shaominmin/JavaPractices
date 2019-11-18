class Person {
	//属性
String name;
int age;
//方法（普通方法）
public void sayHello(String target){
System.out.println(name+"say hello to"+target);	
	
}
//构造器
//长得像方法，但1.方法名称必须和类名相同2.不能有返回值类型
//用来做对象的初始化（初始化属性）
public Person(){
name="秘密";
age=-1;
}	
//构造器的重载
pubic Person(String n,int a){
name=n;
age=a;
}
}
public class Main{
	public static void main(String[]args){
		Person p=new Person();
		p.name="李华";
		p.age=18;
		p.sayHello("小明");
		
	}
}