//编写一个类Calculator
//有两个属性num1,num2
//这两个数据的值，不能在定义的同时初始化
//最后实现加减乘除四种运算.
public class CalculatorPractice{
	private double num1;
	private double num2;
	public double add(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
		return this.num1+this.num2;
	}
		public double sub(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
		return this.num1-this.num2;
	}
		public double mul(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
		return this.num1*this.num2;
	}
		public double div(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
		return this.num1/this.num2;
	}
	public static void main(String[]args){
      CalculatorPractice calculatorPractice=new CalculatorPractice();
       System.out.println("num1+num2="+calculatorPractice.add(10.0,20.0));
       System.out.println("num1-num2="+calculatorPractice.sub(10.0,20.0));
       System.out.println("num1*num2="+calculatorPractice.mul(10.0,20.0));
       System.out.println("num1/num2="+calculatorPractice.div(10.0,20.0));
    }	
}
