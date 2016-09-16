
public class Reverse_string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String demo="this is on mobile";
		reverse(demo);
		reverse1(demo);
	}
	public static void reverse1(String s)
	{
		String reverseStr="";
		String word="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				reverseStr=reverseStr+word+s.charAt(i);
				word="";
				continue;
			}
			if(i==s.length()-1)
			{
				word=s.charAt(i)+word;
				reverseStr=reverseStr+word;
				continue;
			}
			word=s.charAt(i)+word;
			
		}
		System.out.println(reverseStr);
	}
public static void reverse(String s){
	String words[]=s.split(" ");
	String reverseString="";
	for(int i=0;i<words.length;i++){
		String word=words[i];
		String reverseword="";
		for (int j = word.length()-1; j >= 0; j--) 
        {
            reverseword = reverseword + word.charAt(j);
        }
        reverseString = reverseString + reverseword + " ";
    }
	System.out.println(s);
    
    System.out.println(reverseString);
     
    System.out.println("-------------------------");
	}
}

