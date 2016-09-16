
public class String_testing {

	
	public static void main(String[] args) {
		String inp="this is onmobile";
		String out=reverse(inp);
		System.out.println(out);
	}
public static String reverse(String s){
	String reverse="";
	String word ="";
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)==' '){
		reverse = reverse + word+ s.charAt(i);
		word="";
		}
        if(i==s.length()-1){
        	reverse = reverse + word;
		}
	word=s.charAt(i)+word;
	
	}
	return reverse;
}
}
