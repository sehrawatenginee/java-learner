
public class Insertion_sort {

	
	public static void main(String[] args)
	{
		int arr1[]={21,34,56,66,1,13,55,67,23};
		//Insertion_sort isr= new Insertion_sort();
		        int arr3[]=Insertion(arr1);
		        for(int index :arr3)
		        {
		System.out.println("sorted array is" + index);
		        }
	}
			public static int [] Insertion(int arr2[])
			{
	             
				int temp;
				for(int i=0;i<arr2.length;i++)
				{
					for(int j=i;j>0;j--)
					{
						if(arr2[j-1]>arr2[j])
						{
							temp=arr2[j];
							arr2[j]=arr2[j-1];
							arr2[j-1]=temp;
							
						}
						
					}
				} 
				
				return arr2;
			}
}
