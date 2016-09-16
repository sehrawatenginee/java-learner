/*"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input

hello
java
Sample Output

9
No
Hello Java
Explanation

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is . 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,  is not larger than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java". */
public class Lexcicography {


	public static void main(String[] args) {
		String A="vuut";
		String B="vuuuuu";
lex(A,B);
	}
public static void lex(String a,String b){
	int z=a.length();
	int x=b.length();
	int y=z+x;
	System.out.println(y);
	if(a.compareTo(b)>0){//compare to method is used for comparing two strings in lexicographic order
		System.out.println("Yes");
		}
	else
		System.out.println("No");
	char arr1[]=a.toCharArray();
	for(int i=0;i<arr1.length;i++){}
	arr1[0]=Character.toUpperCase(arr1[0]);
	String g=new String(arr1);
	char arr2[]=b.toCharArray();
	arr2[0]=Character.toUpperCase(arr2[0]);
	String h=new String(arr2);
	
	   
	System.out.println(g+" "+h);
	
}

}