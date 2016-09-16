import java.io.*;
public class ancd 
{ 

    public static String collegecomparison(int input1,int[] input2,int[] input3)
    {
        int k = 0;
		int l=0;
		String result = null;
		for(int i=0;i<=input2.length-1;i++){
		for(int j=0;j<=input3.length-1;j++)	
		{
			if(l!=1)
			{
				if (input2[i]<0)
				{
					System.out.println("Invalid");
					result = "Invalid";
					l=1;
				}
			}
				if(input3[j]<0)
				{
					System.out.println("Invalid");
					break;
				}
				if(input2[i]==input3[j]){
					//System.out.println("Equal");
					k++;
					break;
			}
			else
				System.out.println("Unequal");
		}
		l=0;
		}
		if(k==input1)
		{
			System.out.println("the arrays are equal" + k);
			result = "valid";
		}
		else
		{
			System.out.println("they are not equal " + k);
			result = "Unequal";
		}
		   return result;
	}
  
 
}