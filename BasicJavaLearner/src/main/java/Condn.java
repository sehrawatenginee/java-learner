import java.util.Scanner;


public class Condn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		demo(n);

	}
	public static void demo(int i){
		
			if((i>=2&&i<=5)&&i%2==0){
				System.out.println("not weird");
			}
			if((i>=6&&i<=20) && i%2==0){
				System.out.println(" weird");
			}
			if((i>20)&&i%2==0){
				System.out.println("not weird");
		}
			else
				System.out.println("Weird");
	}

}
