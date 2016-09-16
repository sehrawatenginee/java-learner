
public class Largest {

static int[] demo = {23,34,-21,-37,67};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest=demo[0],smallest=demo[0];
for(int i=0;i<=demo.length-1;i++)
{
	if(demo[i]>largest)
	{
		largest = demo[i];
	}
	else
	{
		if(demo[i]<smallest)
		{
			smallest = demo[i];
		}
	}
}
System.out.println("largest no is" + largest);
System.out.println("smallest no is" + smallest);
	}
	}


