import java.util.*;
public class MedianHeap {

	public static void insert(ArrayList<Integer> alst, int item) {
		int arrback = alst.size();
		if(arrback<=alst.size()) {
			alst.add(arrback, item);
		}
	}
  
	public static int findKthElement(ArrayList<Integer> alst, int k) {
		
		if(alst.get(k) != null) {
			return alst.indexOf(k);
		}		
		
		return -1;
	}
	
	public static void removeKthElement(ArrayList<Integer> alst, int k) {
		alst.remove(findKthElement(alst, k));
	}
	
	public static void main(String[]args) {
		
		ArrayList<Integer> alst = new ArrayList<Integer>();		
		
		insert(alst, 1);
		insert(alst, 2);
		insert(alst, 7);
		insert(alst, 5);
		insert(alst, 12);

		System.out.println(alst);
		
		System.out.println("Element 5 is at index: "+findKthElement(alst, 5));
		System.out.println("Element 1 is at index: "+findKthElement(alst, 1));
		
		removeKthElement(alst, 2);
		System.out.print("Heap after 2 is deleted: "+alst);

		
	}
}
