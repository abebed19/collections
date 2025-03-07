import java.util.HashMap;
import java.util.Map;


public class Main{
    public static void main(String [] args){
     
        Map<String,Integer> map =  new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);
        System.out.println(map.put("Five",6));
    
        //iterating through the values
        for (int value : map.values()){
            System.out.println(value);
        } 

        //iterating through keys
        //
        for(String key : map.keySet()){
            map.putIfAbsent(key,-1);
        }
        System.out.println(map.remove("One",1));
        //Checking the existance of a Key or A value
        //
        System.out.println(map.containsKey("One"));
        System.out.println(map.containsValue(2) + "  from the map pair" + map);

        System.out.println("Values => "+ map.values());

        System.out.println("List of keys "+ map.keySet());

    
    }
}
