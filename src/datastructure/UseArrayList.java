package datastructure;

import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

			//Creating object of Arraylist and stored values
		ArrayList<String> al= new ArrayList<String>();


		al.add("a");
		al.add("f");
		al.add("c");
		al.add("d");
		al.add("z");
		al.add("f");
		al.add("w");
		al.add("h");
		al.add("n");
		System.out.println("There are " + al + " within this list!" + "\n");

		al.remove(8);
		al.remove(7);



		// For each loop
		for(String obj:al){
			System.out.println(al + "\n");
		}
		al.remove(6);
		al.remove(5);

		System.out.println("Now the last letter is " + al.get(4) + "\n");

		Iterator<String> iter = al.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}

			// Sorting it
		Collections.sort(al);
		System.out.println(al);

			//Storing ini database
		//ConnectToSqlDB.connectToSqlDatabase();
		//ConnectToSqlDB DB = new ConnectToSqlDB();



		//insertDataFromArrayListToSqlTable();		//(List<Student> list, String tableName, String columnName)

	}

}
