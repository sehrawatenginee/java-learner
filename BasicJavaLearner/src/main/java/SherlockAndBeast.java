

import java.util.Scanner;

public class SherlockAndBeast {

	private static long getDecentNumber(int digit){

		if(digit>2){
			long no=0;
			if(digit%3==0){
				for(long i=0;i<digit;i++){
					no*=10;
					no+=5;
				}
			}else{
				long no5=get5Numbers(digit);
				if((digit-no5)%5==0){
					for(long i=0;i<no5;i++){
						no*=10;
						no+=5;
					}

					for(long i=no5;i<digit;i++){
						no*=10;
						no+=3;
					}
				}else{
					no=-1;
				}
			}


			return no;
		}
		return -1;
	}

	private static long get5Numbers(int digit) {
		long no=0;
		switch (digit) {
		case 8: no= 3;
		break;
		case 11:no=6;
		break;
		case 13:no=3;
		break;
		case 14:no=9;
		break;
		case 16:no=6;
		break;
		case 17:no=12;
		break;
		case 20:no=15;
		break;

		default:	
			break;
		}
		return no;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			System.out.println(getDecentNumber(sc.nextInt()));
		}


	}
}
