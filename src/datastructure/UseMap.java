package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> animanl = new ArrayList<String>();
		animanl.add("dog");
		animanl.add("cat");
		animanl.add("bird");
		animanl.add("fish");
		animanl.add("lizard");
		animanl.add("bug");

		Map<Integer,List<String> > finder = new HashMap<Integer, List<String>>();

		finder.put(1, animanl);
		finder.put(2, animanl);
		finder.put(3, animanl);
		finder.put(4, animanl);
		finder.put(5, animanl);
		finder.put(6, animanl);


		//Loops
		for (Map.Entry<Integer, List<String>> MLobj:finder.entrySet() ){

			System.out.println(MLobj.getKey() +" " + MLobj.getValue());
		}

	}

}
