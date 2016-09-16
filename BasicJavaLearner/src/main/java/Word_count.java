
public class Word_count {


	public static void main(String[] args) {
		String s2="He is a very very good boy, isn't he?";
		//String s3=s2.toLowerCase();
		int total=count(s2);
		System.out.println(total-1);
		words(s2);
	}
public static int count(String s){
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	int ASCII_value=s.charAt(i);//ascii value of fetched words
	if(ASCII_value<65||ASCII_value>72&&ASCII_value<95&&ASCII_value>122){
		count++;
		
		}
	}return count;
}
	public static void words(String t){
		String total="";
	for(int j=0;j<t.length();j++){
		int ASCII_value=t.charAt(j);
	if(ASCII_value>=97&&ASCII_value<=122||ASCII_value>=65&&ASCII_value<=90){
		char word=(char) ASCII_value;
		System.out.print(word);
	
	}
	else
		System.out.println();
	}
	}
}

