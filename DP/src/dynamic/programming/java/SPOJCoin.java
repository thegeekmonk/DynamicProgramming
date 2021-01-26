package dynamic.programming.java;

public class SPOJCoin {

	
	public static int maximize(int sum,int n)
	{
		if(sum >= n)
			return sum;
		else
			return n;
	}
	
	public static void maxDollar(int n)
	{
		int sum = 0;
		int a,b,c;
		
		a = n/2;
		b = n/3;
		c = n/4;
		
		sum = a + b + c;
		
		System.out.println("Maximum Dollar : "+maximize(sum,n));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int num = 12;
				
		maxDollar(num);		
	}

}
