import java.util.*;
public class SortedSetImplementation {
	public static void main(String[]args) {
		
		SortedSet<Integer> ss = new TreeSet<Integer>();
		
		//insert
		ss.add(1);
		ss.add(5);
		ss.add(34);
		ss.add(16);
		ss.add(7);
		ss.add(4);
		ss.add(2);
		ss.add(22);
		ss.add(19);
		ss.add(12);

		System.out.println("Original:\n"+ss);
		
		//remove
		
		ss.remove(1);
		ss.remove(22);
		ss.remove(4);
		
		System.out.println("After remove:\n"+ss);
		
		//contains 22, 34
		System.out.println("The set contains 22:\n"+ss.contains(22));
		System.out.println("The set contains 34:\n"+ss.contains(34));
		
				
		
	}
}
