import java.util.HashMap;
import java.util.Map;
 
public class Array_demo {
 
 /**
  * Word occurrence in a String Example
  * This example will get occurrence of word in sentence in String
  */
 public static void main(String[] args) {
     
   // String occurrence to check
   String wordOccurrence = "string are count , java can see count java are not";
     
   // This will get all word in string and then find number of occurrence 
   // in string sentence. We need to find same word number of times
  // String[] words = wordOccurrence.toLowerCase().split("\\s+");
 char alpha[]=wordOccurrence.toCharArray();
   // Here we set number of String word occurrence in map
   Map<Character, Integer> wordCounts = new HashMap<Character, Integer>();
 
   for (Character word : alpha) {
	  
      Integer count = wordCounts.get(word);
           if (count == null) {
            count = 0;
        }
        wordCounts.put(word, count + 1);
    }
     System.out.println(wordCounts);
  }
}

	/*public static void main(String[] args){
	String s1= "this is india and hindi is the mother language java lovers java c++ ";
	int c=0;
	HashMap<String,Integer> mp  =Occurence( s1,c) ;
	System.out.println(mp);
	}
	public static HashMap<String,Integer>Occurence(String s2, Integer count)
	{
	HashMap<String,Integer> mp= new HashMap<String,Integer>();
	String word[]=s2.split("\\s");
	for(String words : word){
		 count=mp.get(words);
		 
		 
		if ( count == null)
		{
			count=0;
		}
		mp.put(words, count +1);
	}
	
	return mp;
}
	
}*/	

