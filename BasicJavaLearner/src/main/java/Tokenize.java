import java.util.ArrayList;
import java.util.List;

public class Tokenize {

       public static void main(String[] args) {
              String s = "This is On Mobile";
              List<String> list = split(s,' ');
              System.out.println(list);
       }
       
       public static List<String> split(String str, char token){
              List<String> list = new ArrayList<String>();
              String singleStr = "";
              for(int i=0;i<str.length();i++){
                     char c = str.charAt(i);
                     if(c != token){
                           singleStr = singleStr + c;
                           if(i == (str.length()-1)){
                                  list.add(singleStr);
                                  singleStr = "";
                           }
                     }else if(c == token){
                           list.add(singleStr);
                           singleStr = "";
                           
                     }
              }
              
              return list;
       }
}


