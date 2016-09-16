import java.util.HashSet;


public class Common_element_array {

	public static void main(String[] args) {
		int arr1[]={4,5,6,7,8,9,10};
		int arr2[]={6,7,8,9,10,11,12};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					hs.add(arr1[i]);
				}
			}
			
		}
		System.out.println(hs);

	}

}
