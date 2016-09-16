
public class Testing11 {

	
	public static void main(String[] args) {
		int arr1[] = {1,22,3,4,5,5,6,6,7,8,8};
Testing11 ts =new Testing11();
ts.loyality(arr1);

	}
public int loyality(int[] arr){
	int count=0;
	for(int i =0;i<=arr.length;i++)
		for(int j=1;j<arr.length-1;j++){
			if(arr[i]==arr[j])
			{
				count++;
			}
			else
				continue;
		}
		
		
	
	
	return count;
}
}
