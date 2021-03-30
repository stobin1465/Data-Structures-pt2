import java.math.*;


public class SumOfArray 
{
	public static void main(String args[]) 
	{
		
	      int[] myArray = {1,5,6,5,4,1};
	      int sum = 0;
		
	      for(int i=0; i<myArray.length; i++){
	          
	          sum = sum + myArray[i];
	      }
	          
	          System.out.println(sum);
	      
	}
	
	public static int[] toPower(int power, int size)
	{
		int[] newArray = new int[size];
	
		 for(int i=0; i<newArray.length; i++)
		 {
			 newArray[i] = (int) Math.pow(i, power);
			 
		 }
		 return newArray;
	}
	
	
	
}
