import java.util.ArrayList;
import java.util.Arrays;


public class Search {
//static int test[] = { 34,23,55,46,34,22,11 };
String name;
int age ;
String city;

	public static void main(String[] args) {
		
ArrayList<Search> arl = new ArrayList<Search>();
//for(int i : test){
	Search s = new Search("N", 20, "sss");
	arl.add(new Search("Nitish",30,"Bang"));
	arl.add(new Search("Suk",31,"Alld"));
	arl.add(new Search("Alok",40,"pune"));
//}
boolean Result=arl.contains(55);
	System.out.println("no found"+Result);
System.out.println(arl);
	}

	public Search(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
		public String toString() {
			return "name: "+name+" age: "+age+" city: "+city;
		}
}
