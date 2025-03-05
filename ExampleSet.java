import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class ExampleSet{
	public static void main(String[] args){

		List<String> numbers = List.of("One","Two","Three","Four","Five","Six");

		Set<String> sets = new HashSet<>();

		sets.addAll(numbers);
		sets.forEach(System.out::println);

         
		


	}
}
