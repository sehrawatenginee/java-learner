import java.util.HashMap;
import java.util.Scanner;


public class Ankit_test {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		   String s=sc.nextLine();
           System.out.println(s);
       char c= Occurance(s);
       System.out.println(c);
}
	public static Character Occurance(String strng){
		/*int count=0;
		char[] word=strng.toCharArray();
		for(int i=0;i<word.length;i++)
			{
			      for(int j=i;j<word.length;j++)
		              {
			                if(word[i]==word[j])
			                  {
			                     count++;
			                  }
			               
		              }
		System.out.println(word[i] +"="+count);
		count=0;
		
		    }
}*/
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		int count=0;
		for(int i=0;i<strng.length();i++){
		char c=strng.charAt(i);
		
             if(hs.containsKey(c)){
            	hs.put(c,hs.get(c)+1); 
             }
             else
             {
            	 hs.put(c,1);
            	 }
             }
		for (int i =0 ; i < strng.length() ; i++ )
        {
           char c= strng.charAt(i);
            if( hs.get(c)  == 1 )
            return c;
        }
        return null ;
    }
}

