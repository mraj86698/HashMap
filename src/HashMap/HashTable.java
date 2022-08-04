package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashTable {
//	 /**
//	    * Keys that have the same hash code are placed together in a linked list.
//	    * A Node holds a (key,value) pair.
//	    */
//	   private static class Node {
//	      String key;
//	      String value;
//	      Node next;  // Pointer to next node in the list;
//	                      // A null- end of the list.
//	   }
//
//	   private Node[] table;  // The hash table, represented as  an array of linked lists.
//
//	   private int count;  // The number of (key,value) pairs in the hash table.
//
//	   /**
//	    * Create a hash table with an initial size of 64.
//	    */
//	   public HashTable() {
//	      table = new Node[64];
//	   }
//	   /**
//	    * Create a hash table with a specified initial size.
//	    * Precondition: initalSize > 0.
//	    */
//	   public HashTable(int initialSize) {
//	      if (initialSize <= 0)
//	         throw new IllegalArgumentException("Illegal table size");
//	      table = new Node[initialSize];
//	   }
//	  public void wordCount(String s) {
//
//		// String s = "this is a this is this a this yes this is a this what it may be i do not care about this";
//
//	        String a[] = s.split(" ");
//	        Map<String, Integer> words = new HashMap<>();
//	        for (String str : a) {
//	            if (words.containsKey(str)) {
//	                words.put(str, 1 + words.get(str));
//	            } else {
//	                words.put(str, 1);
//	            }
//	        }
//	        System.out.println(words);
//
//	  }
//
//
//	  public void removeDuplicates(){
//		  String str, result = "";
//			String words[];
//
//			Scanner sc = new Scanner(System.in);
//			// Accept any sentence from User
//			System.out.print("Enter your sentence: ");
//			str = sc.nextLine().toLowerCase();  //convert to lower case
//
//			// Split and each word as String array
//			words = str.split(" ");
//
//			// Convert String Array allWords to LinkedHashSet to remove duplicates
//	        LinkedHashSet<String> set = new LinkedHashSet<String>( Arrays.asList(words) );
//
//			// Convert to String
//			for(String word: set) {
//				result = result + word + " ";
//			}
//			// Display given String after removing duplicates
//			System.out.println("Sentence after removing duplicate words: " + result);
//
//
//	  }
	 public void wordCount(String s) {
		 /**
		  * Declaring a HashMap of <String, Integer>
		  * Splitting the string and storing the array.
		  * The word as key and its occurrence as value in the HashMap.
		  * Incrementing the value the word is already present in the HashMap.
		  */

	String str = "TO BE OR NOT TO BE";

    // Declaring a HashMap of <String, Integer>
    Map<String, Integer> hashMap = new HashMap<>();
    String[] words = str.split(" ");

    for (String word : words) {
        Integer integer = hashMap.get(word);

        if (integer == null)
            hashMap.put(word, 1);

        else {
            hashMap.put(word, integer + 1);
        }
    }
    System.out.println(hashMap);
	 }


}







