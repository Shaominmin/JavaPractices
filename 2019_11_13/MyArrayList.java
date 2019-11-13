//顺序表中存储的元素的类型是int类型
import java.util.Arrays;
public class MyArrayList{
     private int[] array;
	 private int size;
	 MyArrayList(){
	 array=new int[10];
	 size=0;
	 }
	 
    //尾插
    //时间复杂度O（1）
    //空间复杂度O（1）
	public void pushBack(int element){
	/*
	array[size]=element;
	size++;
	*/
	array[size++]=element;
	}
	//尾删
	//时间复杂度O（1）
    //空间复杂度O（1）
	public void popBack(){
	array[--size]=0;
	}
	
	//头插
	public void pushFront(int element){
	//把原有数据全部后移一格
	//i代表实心
	for(int i=size-1;i>=0;i--){
	array[i+1]=array [i];
	}
	//把新的元素放到0下标处
	array[0]=element;
	//长度+1
	size++;
	}
	
	/*
	void popFront(){
	
	}
	*/
	
	public void insert(int element,int index){
	for (int i=size-1;i>=index;i--){
	array[i+1]=array [i];
	}
	array[index]=element;
	size++;
	}
	
	@Override
	public String toString(){
	return Arrays.toString(Arrays.copyOf(array,size));
	}
	
	public static void main (String[]args){
       MyArrayList list=new MyArrayList();
	   list.pushBack(1);
	   list.pushBack(2);
	   list.pushBack(3);
	   list.pushFront(10);
	   // list.pushFront(20);
	   // list.pushFront(30);
	   System.out.println(list);
	   list.insert(100,2);
	   System.out.println(list);
	   /*
	   list.popBack();
	   list.popBack();
	   System.out.println(list);
	   list.popBack();
	   System.out.println(list);
	   */
    } 
}
