
public class Compare_Array {
int input1;
static int[] input2 = {-12,11,5,2,7,5,11};
static int[] input3 ={5,12,5,7,11,-2,11}; 

	public static void main(String[] args) {
	/*	if(input2==input3)
		{System.out.println("equal");
		}
		else
			System.out.println("unequal");
			*/
		int k = 0;
		int l=0;
		for(int i=0;i<=input2.length-1;i++)
		{
			for(int j=0;j<=input3.length-1;j++)	
			{
				if(l!=1)
				{
					if (input2[i]<0)
					{
						System.out.println("Invalid input");
						l=1;
					}
				}
				if(input3[j]<0)
				{
					System.out.println("invalid value for second college");
					break;
				}
				if(input2[i]==input3[j])
				{
					//System.out.println("equal");
					k++;
					break;
				}
				else
					System.out.println("unequal");
				}
				l=0;
			}
			if(k==7)
			{
				System.out.println("the arrays are equal" + k);
			}
			else
				System.out.println("they are not equal " + k);
	}
}