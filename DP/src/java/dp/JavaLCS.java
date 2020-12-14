package java.dp;

public class JavaLCS {
    
	public static int max(int x,int y)
	{
         if(x >= y)
        	 return x;
         else
        	 return y;
	}
	
	
	public static int lcs(String str1,String str2)
	{
		int num = 0; 
		
		int D[][] = new int[10][10];
		
		for(int i = 0;i < 10;i++)
			D[i][0] = 0;
		
		for(int j = 0;j < 10;j++)
			D[j][0] = 0;
		
		
		
		return num;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String str1 = "ABCBDAB";
		String str2 = "BDCABC";
		
		
		System.out.println("LCS of given two string is : "+lcs(str1,str2));
		
	}

}
