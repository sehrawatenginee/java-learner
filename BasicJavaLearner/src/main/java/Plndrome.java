


import java.io.*;
import java.util.*;

public class Plndrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the String to be reversed");
        String A=sc.next();
       String reverse1= reverse_string(A);
       System.out.println(reverse1);
       if(A.equals(reverse1))
           System.out.println("Yes");
       else
           System.out.println("No");
        
    }
      /*char arr1[]=A.toCharArray();
        for(int i=0;i<A.length()/2;i++)
            {
            if(arr1[i]==arr1[A.length()-1]){
            	
                System.out.println("YES");
                }
            else
                System.out.println("NO");
            
        }*/
    public static String reverse_string(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
        	reverse= reverse + s.charAt(i);
        }
      return reverse;
        
        
    	/*if(s==reverse)
            System.out.println("Yes");
        else
            System.out.println("No");
        */
    }
}
