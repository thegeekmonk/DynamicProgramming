package dynamic.programming.java;

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
		//int num = 0; 		
		int D[][] = new int[10][10];  //Memoization
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		//solving the base case for 1st string
		for(int i = 0;i <= len1;i++)
			D[i][0] = 0;
		
		//solving the base case for 2nd string
		for(int j = 0;j <= len2;j++)
			D[j][0] = 0;
		
		
//		if(str1.charAt(0) == str2.charAt(0))
//			   D[0][0] =  1;	
		
		//D[i][j] : LCS of strings having length as i and j respectively  
		
		for(int i = 1;i <= len1;i++)
		{
			for(int j = 1;j <= len2;j++)
			{
				if(str1.charAt(i-1) == str2.charAt(j-1))
				{	
					D[i][j] = D[i-1][j-1] + 1;
				}	
				else
				{   
					D[i][j] = max(D[i-1][j],D[i][j-1]);
				}					
			}
		}
		
		return D[len1][len2];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String str1 = "ABCBDAB";
		String str2 = "BDCABC";
				
		System.out.println("LCS of given two string is : "+lcs(str1,str2));		
	}

}
