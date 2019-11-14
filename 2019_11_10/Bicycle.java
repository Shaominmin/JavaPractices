//访问限定符--够用就行
public class Bicycle{
String color; //颜色
int nowSpeed; //当前速度
int maxSpeed;//最大速度
 //构造方法
 Bicycle(){
	 color="黑色"; 
     nowSpeed=0; 
     maxSpeed=90;
 }
 Bicycle(String color){
	 color=color; 
     nowSpeed=0; 
     maxSpeed=90;
 }
 //方法
 //setter
 void setColor(String color){
	 this.color=color;
 }
 void speedUp(){
	 nowSpeed+=10;
	 if (nowSpeed>maxSpeed){
		 nowSpeed=maxSpeed;
	 }
 }
 void speedDown(){
	 nowSpeed-=10;
	 if (nowSpeed<0){
		 nowSpeed=0;
	 }
 }
 // getter
	String getColor() {
		return color;
	}
	
	int getNowSpeed() {
		return nowSpeed;
	}
}
