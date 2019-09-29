import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		//Create a list with the following numbers: 1, 23, 9, 77, 922, 6, 32, 63, 14, 5
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(23);
		numbers.add(9);
		numbers.add(77);
		numbers.add(922);
		numbers.add(6);
		numbers.add(32);
		numbers.add(63);
		numbers.add(14);
		numbers.add(5);
		
		if(numbers.contains(23)) {
			System.out.println("23 is in our collection");
		} else {
			System.out.println("23 is not in our collection.");
		}
		
		if(numbers.contains(77)) {
			System.out.println("77 is in our collection");
		} else {
			System.out.println("77 is not in our collection");
		}
		
		if(numbers.contains(15)) {
			System.out.println("15 is in our collection");
		} else {
			System.out.println("15 is not in our collection");
		}
		System.out.println("After removing 23.");
		numbers.remove((Integer) (23));
		
		if(numbers.contains(23)) {
			System.out.println("23 is in our collection");
		} else {
			System.out.println("23 is not in our collection");
		}
	}

}
