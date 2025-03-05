import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;

public class ExampleList{
  
 public static void main(String[] args){

   List<String> strings = new ArrayList<>(List.of("0","1","2","3","4","5"));
   System.out.println(strings);

   strings.subList(2,5).clear();
   System.out.println("After Modifing the sublist" +strings);

   // Iterating over list of elements
   
   List<String> nums = List.of("One","Two","Three");
   ListIterator<String> iterator =nums.listIterator();

   while(iterator.hasNext()){

    String element = iterator.next();

    if(Objects.equals(element,"Two")){
	 iterator.set("2");
    }
   }

   System.out.println("Elements in num =>"+ nums);

 

  
  }

}
