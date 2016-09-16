import java.util.Scanner;


public class Static_demo {

	static int B;
	static int H;
	static boolean flag=true;
	static{
	   
		Scanner sc=new Scanner(System.in);
		B=sc.nextInt();
		H=sc.nextInt();
		try {
			if(B<=0 ||H<=0){
				System.out.println("java.lang.Exception: Breadth and height must be positive");
				 flag=false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
	/*public static int Area(){
		int A=B*H;
		return A;
		}*/
	
	/*public static void main(String[] args) {
		if(B<=0 ||H<=0){
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		else 
			System.out.println(Static_demo.Area());

	}*/
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}
