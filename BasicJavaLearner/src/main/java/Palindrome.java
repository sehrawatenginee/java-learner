

public class Palindrome {

	public static void main(String[] args) {
		
		int a=122344;
		int b=122344;
		int c=0;
		while(b!=0)
		{
			c++;
			b=b/10;
		}
		int arr[]=new int[c];
		int i=0;
		while(a!=0)
		{
			arr[i]=a%10;
			i++;
			a=a/10;
		}
	    int rep[]=new int[10];
	    for(int j=0; j<arr.length; j++)
	    {
	    	rep[arr[j]]++;
	    }
		for(int j=0; j<rep.length; j++)
		{
			if(rep[j]>0)
			{
				System.out.println(j+" has occurred "+rep[j]+" times.");
			}
		}
		 boolean palindrome = true;
		 for(int j=0; j<arr.length; j++)
		 {
			 if(arr[j]!=arr[arr.length-j-1])
			 {
				 palindrome=false;
				 break;
			 }
		 }
		System.out.println("This is a palindrome: "+palindrome);
	}

}
