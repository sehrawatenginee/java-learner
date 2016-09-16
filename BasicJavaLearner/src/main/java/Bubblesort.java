import java.util.ArrayList;
import java.util.List;


public class Bubblesort {

	
	public static void main(String[] args) {
		int arr1[]={23,45,22,67,43,12};
//		sort(arr1);
		System.out.println(sort(arr1));
		
	}
public static List<Integer> sort(int arr[]){
	List<Integer> ls = new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int temp;
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println(arr[i]);
		ls.add(arr[i]);
	}
//	System.out.println(arr);
	System.out.println();
	 return ls;
}
}
