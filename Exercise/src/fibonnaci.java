
public class fibonnaci {
		
	// 0 1 1 2 3 5 8
	
	public static void fibonacci(int n) {
		int num1=0,num2=1;
		int count=1;
		while(count<=n) {
			System.out.println(num1 + " ");
			
			int num3=num1+num2;
			
			num1=num2;num2=num3;
			count++;
		}

	}
	
	
	public static void main(String args[]) {
		int n = 10;
		fibonacci(n);		
	}

}
