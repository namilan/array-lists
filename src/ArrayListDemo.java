import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");
		
		giantWords.remove(0);
		giantWords.remove("fie");
		
		for(String word: giantWords) {
			System.out.println(word + "!");
		}
		
		System.out.println();
	}

}
