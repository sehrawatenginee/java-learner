
public class Array_sum_equals_to_a_specific_no {

	
	public static void main(String[] args) {
		int arr2[]={1,6,-4,7,8,12,-9,20,14,8};
		int sum=16;
		pair_of_elements(arr2, sum);

	}
public static void pair_of_elements(int arr1[],int n){
	//int sum=0;
	for(int i=0;i<arr1.length;i++){
		for(int j =i+1;j<arr1.length-1;j++){
			if(arr1[i]+arr1[j]==n)
		System.out.println(arr1[i]+ "+" +arr1[j] + "=" +n);		
		}
		}
	//return sum;
}
}
