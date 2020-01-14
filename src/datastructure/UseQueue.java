package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> name= new LinkedList<String>();
		name.add("rob");
		name.add("mary");
		name.add("john");
		name.add("micky");
		name.add("sammy");
		name.add("james");
		name.add("jackie");
		name.add("rick");

		System.out.println("So far we have " + name + '\n' );
		System.out.println("But the first is " + name.peek() );
		name.poll();
		System.out.println("now its " + name + '\n');
		System.out.println("So the first becomes " + name.peek());

		Iterator iter= name.iterator();

		while (iter.hasNext()){
			System.out.println(iter.next());
		}



	}

}
