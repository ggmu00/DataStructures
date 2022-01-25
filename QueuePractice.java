import java.util.LinkedList; 
import java.util.Queue; 

public class QueuePractice {
	public static void main(String[] args) {
		 Queue<Integer> queue = new LinkedList<>(); 
		 fill(queue);
		 print(queue);
	}
	public static void fill(Queue<Integer>q) {
		for(int i = 0; i<=5; i++) {
			q.add(i);
		}
	}
	public static void print(Queue<Integer>q) {
		System.out.println(q);
	}
	
	
}
