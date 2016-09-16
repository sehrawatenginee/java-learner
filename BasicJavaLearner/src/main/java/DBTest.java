

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBTest {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DBTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "DBTest [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
          Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "onmobile");
          Statement stmt=conn.createStatement();
          
          ResultSet rs=stmt.executeQuery("SELECT * FROM TEST");
          List<DBTest> list=new ArrayList<DBTest>();
          while(rs.next()){
        	  list.add(new DBTest(rs.getInt("ID"), rs.getString("NAME")));
          }
          System.out.println(list);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
