/*import java.util.Arrays;


public class Anagram {

	
	public static void main(String[] args) {
		String ist="grammer";
		String second="mmerra";
        Anagram(ist,second);
	}
public static boolean Anagram(String A,String B){
	boolean status=true;
	if(A.length()!=B.length()){
		 status= false;
		 System.out.println("Not Anagrams");
	}
	else{
		char arr1[]=A.toLowerCase().toCharArray();
		char arr2[]=B.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		 status=Arrays.equals(arr1, arr2);
		 if(status==true){
			 System.out.println("Anagrams");
		 }
		 else
			 System.out.println("Not Anagrams");
		}return status;
	}

}
*/

import java.io.*;
import java.util.*;
public class Anagram {

    static boolean isAnagram(String A, String B) {
        boolean status=true;
	if(A.length()!=B.length()){
		 status= false;
		// System.out.println("Not Anagrams");
	}
	else{
		char arr1[]=A.toLowerCase().toCharArray();
		char arr2[]=B.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		 status=Arrays.equals(arr1, arr2);
		}return status;
	}
        
    
  
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}


