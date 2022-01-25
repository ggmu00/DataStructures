import java.util.*;
//HR: Alex Rodriguez
public class DoubleEndedPriorityQueue {		
	public static void insert(int [] array, int item) {
		int arrback = 0;
		
		if(arrback<=array.length) {
			array[arrback] = item;
			arrback++;			
		}
	}
	public static int findMin(ArrayList<Integer>array) {
		int min = 0;
		int arrfront = 0;
		
		for(int i = 0; i<=array.size();i++) {
			min=array.get(i);
			if(array.get(arrfront)<=min) {
				min=array.get(arrfront);
				arrfront++;
			}
		}
		return min;
	}
	
	public static int findMax(ArrayList<Integer>array) {
		
		int max = array.size();
		int arrBack = array.size() ;
		
		for(int i = 0; i<=array.size();i++) {
			max=array.get(i);
			if(array.get(arrBack)>=max) {
				max = array.get(arrBack);
				arrBack++;
			}
		}
		return max;
		
	}
	
	
	public static void deleteMax(ArrayList<Integer> array) {
		array.remove(findMax(array));
		
	}
	
	public static void deleteMin(ArrayList<Integer>array) {
		array.remove(findMin(array));
	}
}