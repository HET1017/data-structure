package çalýþma;

import java.util.LinkedList;
import java.util.Stack;

import edu.princeton.cs.algs4.Queue;

public class stackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//last in first out
		//push add
		//pop remove
		Stack<String> stack =new Stack<String>();
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");
		
		System.out.println(stack);
		System.out.println("******************************");
		
		String myFavGame=stack.pop();
		
		stack.pop();
		stack.pop();
		System.out.println(stack);
		stack.peek();
		
		
		System.out.println("**********************************************");
		System.out.println("QUEUES");
		//first in first out
		//add enqueue,offer
		//remove dequeue,poll
		
		Queue<String> queue=new Queue<String>();
		queue.enqueue("Karen");
		queue.enqueue("chad");
		queue.enqueue("steve");
		queue.enqueue("harold");
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
	}

}
