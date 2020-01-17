package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		System.out.println(textFile);
		BufferedReader buffR = null;	//buffer
		String fileText = null;		//reader


		//Datastructures
		Stack<String> stack = new Stack<String>();
		LinkedList<String> list = new LinkedList<String>();

		// Creating and place reader into buffer
		//Catching exception
		try {
			FileReader filerR = new FileReader(textFile);
			buffR = new BufferedReader(filerR);

		}catch (FileNotFoundException e) {
			System.out.println(e);
		}

				//Reading lines. Catching Exceptions
		try{

			fileText = buffR.readLine();	// Worked
		} catch (IOException |NullPointerException e ){
			System.out.println(e);
		}

				//Splitting Catching exceptions
		try {
			String [] words = fileText.split(":");

			for(int i=0;i<words.length;i++) {

				System.out.println(words[i]);

				stack.push(words[i]);			//?????

				list.add(words[i]);				//?????

			}
		} catch (NullPointerException e){
			System.out.println(e);
		}

		Iterator iter = list.iterator();

		System.out.println("Linked List Display:");
		while (iter.hasNext()){
			System.out.println(iter.next());
		}













		//Iterator iter = list.iterator();

		//System.out.println("Linked List Display:");

		//while (iter.hasNext())

		//	System.out.println(iter.next());


	}

}
