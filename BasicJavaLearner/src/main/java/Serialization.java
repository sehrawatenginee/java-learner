import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1549689045397334321L;
	String name;
	int id;
	String designation;
	static String roll;
	public Serialization(String n,int i,String d,String r){
		this.name=n;
		this.id=i;
		this.designation=d;
		roll=r;
	}
	public static void main(String[] args) throws IOException{
		
		Serialization sr =new Serialization("Nitesh",4129,"tester","QA");
		FileOutputStream op =new FileOutputStream("C:\\Users\\nitesh.OM\\Desktop\\mis data\\test.ser");
		ObjectOutputStream oz= new ObjectOutputStream(op);
		oz.writeObject(sr);
		oz.close();
		op.close();

			}
}
	
    class Ser_implement{
	
	}

