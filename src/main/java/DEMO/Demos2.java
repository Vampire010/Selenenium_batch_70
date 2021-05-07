package DEMO;

public class Demos2 extends demos
{
	

	
	
	public static void main(String[] args)
	{
		int[] a = {3,9,10};
		int[] b = {13,5,6};
		int sum1 = 0;
		int sum2 = 0;
		int[] c=new int[a.length]; 
		

			for(int i = 0 ; i<=a.length; i++)
			{			
					for(int j =0 ; j<=b.length;j++)
					{
						
						for(int k =0 ; k<=b.length;k++)
						c[k] = a[i] + b[j]; 
						System.out.println(c);
						 
					}
					
					
					
			}
	
	}

}
