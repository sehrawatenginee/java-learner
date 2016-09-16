import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class Lexico2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		int a=sc.nextInt();
        sc.close();
        ArrayList<String> list=new ArrayList<String>();
        lexo(s,a, list);
       /* for(int i=0; i<list.size();i++)
        	System.out.println(list.get(i));*/
           sort(list); 
        

	}
	public static void lexo(String w,int z, ArrayList<String> list){
		for(int i=0;i<w.length()-z+1;i++){
			String temp="";
			for(int j=0;j<z; j++)
				temp=temp+w.charAt(i+j);
			//System.out.println(temp);
			list.add(temp);
			
			//s1=s1+w.charAt(i+j);
			//System.out.println(s1);
			}
		}
	static void sort(ArrayList<String> list)
	{
		Collections.sort(list);
		//for(int i=0;i<list.size();i++){
		System.out.println(list.get(0));
			System.out.println(list.get(list.size()-1));
		}
		}
	
	



