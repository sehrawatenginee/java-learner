import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map implements Comparator<String> {
public int compare(String a, String b)
        { 
	      String old=a;
	      String current =b;
	      return old.compareTo(current);
	    
	    }
	
	public static void main(String[] args) {
		TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
		{
			hm.put("dollar", -60);
			hm.put("rupee", 100);
			hm.put("pound", 160);
			hm.put("yen", 110);
			hm.put("starling", 260);
		/*for(String key :hm.keySet())
		{
			System.out.println("key: " + key + "  value: " +hm.get(key));
		}*/ 
			
			/*for(String s:hm.keySet()){
				if(hm.get(s)==-1){
					
				}*/
			}
			//Iterator<String> it=hm.keySet().iterator();
			Set<Entry<String,Integer>> set =hm.entrySet();
 			for (Entry<String,Integer> entry : set) {
	           System.out.println("key "+entry.getKey() + " value:" + entry.getValue() );
 			}
	            Integer value=hm.get("rupee");
	           
	            hm.put("rupee", value + 20);
	            System.out.println("updated value of rupee="  +  value);
	        }
 			
		}

	


