import java.util.ArrayList;
import java.util.List;


public class Binary_Search{
	
	
	
	public static void main(String[] args) {
		int demo[] = {-23,33,44,55,66,77,88,99,100,123,144,166};
		//int length_of_array = demo.length;
		int y=66;
		int first = 0;
		int last = demo.length-1;
		System.out.println("length:" +demo.length);
		//Binary_Search bs = new Binary_Search();
		
		System.out.println("Element found" + Search(demo,first,last, y));
	    
	//List<Integer> list = Search(Demo,length_of_array,y);
	//System.out.println(list);
	}
	
		
		//public static List<Integer> Search(int Demo[],int length,int x)
	    public static int Search(int demoLocal[],int first, int last, int x)
		{
			//List<Integer> list = new ArrayList<Integer>();
	    	
			
			 //for(int z =0 ; z <= demoLocal.length-1;z++){
				// int first = 0 ;//-23
				// int last = demoLocal.length-1;//100
	    	      int middle=(first+last)/2;//66
				 System.out.println("first:" +demoLocal[first] + "last:" +  demoLocal[last] + "middle:" +demoLocal[middle]);
				// if(first<=last)
					
				while(first<=last)
				{ 	
					if(demoLocal[middle] == x)
				 	{
					 
						System.out.println("element found at location" +middle);
						return middle;
				 	}
				 	else if( x < demoLocal[middle])
				 	{
				 		last = middle-1;//middle-1;
				 		return Search(demoLocal,first,middle-1,x);
				 	}
				 	else 
				 	{
				 		 first= middle+1;
				 		return Search(demoLocal,first,middle+1,x);
				 	}
				//System.out.println("element not found");
				}
			 
			return x;
			
			
			  
			
			//return list;
		}

	

}
