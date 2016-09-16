
public class linear_search {

	
	 
	
	public static void main(String[] args) {
		int a1[] ={45,65,22,-11,77,33,44};
		int search= 22;
		 linear_search ls= new linear_search();
		 ls.Linear(a1,search );
		 System.out.println("no found at index: " +Linear(a1,search));
		 System.out.println("no not found");

	}
	public static int Linear(int a[],int n)
	{
		
		for(int i =0;i<a.length;i++)
		{
			/*for(int j =i+1;j<a.length;j++)
			{*/
			if(a[i]==n)
				
				return i;
			}
		
		return -1;
	}

}

