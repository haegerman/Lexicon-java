import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		
		list.add("Bertil"); list.add("Anna"); list.add("Lars"); 
		
		System.out.println(list.get(1)); 
		System.out.println(list.size()); 
		System.out.println(list.contains("Ulf")); 
		System.out.println(list.remove(0));
		System.out.println(list.add("Oliver")); 
		System.out.println(list.toString());
		System.out.println("");		
		
		LinkedList<String> list2 = new LinkedList<>(); 
		
		list2.add("Bertil"); list2.add("Anna"); list2.add("Lars"); 
		
		System.out.println(list2.get(1)); 
		System.out.println(list2.size()); 
		System.out.println(list2.contains("Ulf")); 
		System.out.println(list2.remove(0)); 
		System.out.println(list2.toString());
		System.out.println("");
		
		List<String> list3 = new LinkedList<>(); 
		
		list3.add("Bertil"); list3.add("Anna"); list3.add("Lars"); 
		
		System.out.println(list3.get(1)); 
		System.out.println(list3.size()); 
		System.out.println(list3.contains("Ulf")); 
		System.out.println(list3.remove(0)); 
		System.out.println(list.toString());
	}

}
