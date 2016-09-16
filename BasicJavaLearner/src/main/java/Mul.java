
public class Mul {

	
	public static void main(String[] args)
	{
		String s1= "ttisisbangaloreiii";
		//String a[]= s1.split("//s"); 
		char[] a =s1.toCharArray();
		Mul m = new Mul();
		m.Count(a);
		System.out.println("count of " +m.Count(a));
		
		
	}

		
	public static int Count(char b[])
	{
		int count=1;
		
		
		 
		for(int k=0;k<b.length;k++)
		{
		for(int j=k+1;j<b.length;j++)
		{
			if(b[k]==b[j])
			{
			return count;
				
				}
			
			/*else if(b[k]!=b[j])
			{
				
				System.out.println("second loop  "+  b[j]);
			}//System.out.println(a[j]);
		else
				return -1;
		} count = 1;*/
	}
		return -1;
	}
	

return count;   
    
	}
	
}

		
			
			
		
		
		
	

/*public static void reverse(String s, char token)
{
	String s2="";
for(int i=0;i <= s.length();i++)
{
	char c = s.charAt(i);
	if(c!=token)
	{
		s2= s2 +c;
		
	}
	if(c==token)
	{
		
	}
	}
	}
}*/
