//HR:Alex Rodriguez

import java.util.*;
public class PriorityQueueImplementation {
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
	public static void deleteMin(ArrayList<Integer>array) {
		array.remove(findMin(array));
	}
}
