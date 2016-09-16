
public class Selection {

	
	public static void main(String[] args) {
		int arr1[]={34,12,-65,45,8,98,-45};
		Selection_sort(arr1);
    for(int k=0;k<arr1.length;k++){
	System.out.println("sorted array is:  " +arr1[k]);
	}
	}
public static int [] Selection_sort(int arr2[])
{
	for(int i=0;i<arr2.length;i++)
	{
		int index=i;
						for(int j =i+1;j<arr2.length;j++)
						{
								if(arr2[j]<arr2[index])
			
									index=j;
			
							int temp = arr2[index];
							arr2[index]=arr2[i];
							arr2[i]=temp;
						}
	}
	
	
	
	
	
	return arr2;
	
	}
}
