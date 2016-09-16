
public class Missing_no {

	
	public static void main(String[] args) {
		int n =8;
		int arr2[] ={5,6,7,8,12,14,16,18};
		int arr3[]={5,6,7,12,14,16,18};
        int sum1,sum2,result;
        sum1 = array_sum(arr2);
        sum2 = array_sum(arr3);
        result= sum1-sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(result);
	}

//	/*public static int total_sum(int n){
//	int sum =(n*(n+1))/2;
//		return sum;
//	}*/
	
	public static int array_sum(int arr1[]){
		int sum =0;
		for(int i=0;i<arr1.length;i++){
			 sum = sum + arr1[i];
		}
		return sum;
	}
}

