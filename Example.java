import java.util.ArrayList;
import java.util.Collection;

public class Example{
  public static void main(String[] args){
   
    

  //Abebe families
   Collection<String> names = new ArrayList<>();
   System.out.println(names.add("Aaron"));
   System.out.println(names.add("Noah"));
   System.out.println(names.add("one"));
   System.out.println(names.add("Ananya"));

   //parents list
   //
   
   Collection<String> parents = new ArrayList<>();
   parents.add("Genet");
   parents.add("Abebe");

   //
   Collection<String> grandpas = new ArrayList<>();
   grandpas.add("Demis");
   grandpas.add("Abebayehu");
   grandpas.add("T/yohannis");
   grandpas.add("Etenu");

   System.out.println("is parents =>"+parents +" in the names list =>"+ names + names.containsAll(parents));
   System.out.println("is Grandpas =>" +grandpas +" in the names list => "+ names + names.containsAll(grandpas));

   // Merging two  collections into one;
   //
   System.out.println("is Adding parrents in the list of names successfull ?"+  names.addAll(parents));

   System.out.println(" is parents" + parents + "in the list of names" + names+ names.containsAll(parents));

   System.out.println("names = "+ names);
   names.remove("one");
   
   System.out.println("names = "+ names);
   
   if(names.contains("Aaron")){
	   System.out.println("Aaron is here in the list of names +"+ names);

   }

   if(!names.contains("Abebe")){
	   System.out.println("Abebe is not available in the names list "+   names);
   }

   User rebecca = new User("Rebecca");

   if(!names.contains(rebecca)){
    System.out.println("Rebecca is not the list");

   }
  }
}
