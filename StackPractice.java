import java.util.Stack;

public class StackPractice {
	public static void main(String[]args) {
        Stack<Integer> stack = new Stack<Integer>(); 
        stackPush(stack);
        stackPop(stack);
	}
	public static void stackPush(Stack<Integer> stack) {
		for(int i = 0; i < 5; i++) 
        { 
            stack.push(i); 
        } 
	}
	public static void stackPop(Stack<Integer> stack) {
		for(int i = 0; i < 5; i++) 
        { 
            Integer x = (Integer) stack.pop(); 
            System.out.println(x); 
        }
	}
}
