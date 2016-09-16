import java.util.ArrayList;


public class User_defined_data {

	String firstname;
	String lastname;
	int phoneno;

User_defined_data(String n,String l,int no){
	this.firstname=n;
	 this.lastname=l;
	 this.phoneno=no;
	
}
public String toString(){
	return firstname + " " +lastname + " " + phoneno;
}
	public static void main(String[] args) {
		User_defined_data ds1= new User_defined_data("nitesh","sehrawat",9899);
		User_defined_data ds2= new User_defined_data("ramesh","sehrawat",9811);
		User_defined_data ds3= new User_defined_data("suresh","sehrawat",9833);
		User_defined_data ds4= new User_defined_data("suresh","sehrawat",9833);
		ArrayList<User_defined_data> ls = new ArrayList<User_defined_data>();
		ls.add(ds1);
		ls.add(ds2);
		ls.add(ds3);
		ls.add(ds4);
		System.out.println(ls);
		System.out.println(ls.get(1));
		System.out.println(ls.size());
		System.out.println(ls.contains(ds4));
		
	}

}
