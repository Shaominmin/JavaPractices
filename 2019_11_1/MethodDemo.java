public class MethodDemo {
	public static void main (String[]args){
		
		int n=3;
		int ret= jiecheng(n);
	
		System.out.println("ret =" +ret );
	}
		public static int jiecheng(int n){
		if (n==1){
			return 1;
		}			
            return n*jiecheng(n-1);	
	}

}
