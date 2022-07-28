package HashMap;

public class HashTable {
	 /**
	    * Keys that have the same hash code are placed together in a linked list.
	    * A Node holds a (key,value) pair.
	    */
	   private static class Node {
	      String key;
	      String value;
	      Node next;  // Pointer to next node in the list;
	                      // A null- end of the list.
	   }

	   private Node[] table;  // The hash table, represented as  an array of linked lists.

	   private int count;  // The number of (key,value) pairs in the hash table.

	   /**
	    * Create a hash table with an initial size of 64.
	    */
	   public HashTable() {
	      table = new Node[64];
	   }
	   /**
	    * Create a hash table with a specified initial size.
	    * Precondition: initalSize > 0.
	    */
	   public HashTable(int initialSize) {
	      if (initialSize <= 0)
	         throw new IllegalArgumentException("Illegal table size");
	      table = new Node[initialSize];
	   }

	   /**
	    * Associate the specified value with the specified key.
	    * Precondition:  The key is not null.
	    */
	   public void put(String key, String value) {

	      assert key != null : "The key must be non-null";

	      int bucket = hash(key);

	      Node list = table[bucket]; // For traversing the linked list  at the appropriate location.
	      while (list != null) {
	    	  // Search the nodes in the list, to see if the key already exists.
	         if (list.key.equals(key))
	            break;
	         list = list.next;
	      }

	      //list is null, or list.key.equals(key).

	      if (list != null) {
	         list.value = value;
	      }
	      else {

	         if (count >= 0.75*table.length) {
	               // The table is becoming too full.  Increase its size before adding the new node.
	            resize();
	            bucket = hash(key);  // Recompute hash code, since it depends on the table size.
	         }
	         Node newNode = new Node();
	         newNode.key = key;
	         newNode.value = value;
	         newNode.next = table[bucket];
	         table[bucket] = newNode;
	         count++;  // Count the newly added key.
	      }
	      }





	   /**
	    * Return the number of key/value pairs in the table.
	    */
	   public int size() {
	      return count;
	   }


	   /**
	    * Compute a hash code for the key; key cannot be null.
	    * The hash code depends on the size of the table a
	    * Returned the value by key.hashCode().
	    */
	   private int hash(Object key) {
	      return (Math.abs(key.hashCode())) % table.length;
	   }


	   /**
	    * Double the size of the table, and redistribute the
	    * key/value pairs to their proper locations in the
	    * new table.
	    */
	   private void resize() {
	      Node[] newtable = new Node[table.length*2];
	      for (int i = 0; i < table.length; i++) {

	         Node list = table[i];
	         while (list != null) {

	            Node next = list.next;

	            int hash = (Math.abs(list.key.hashCode())) % newtable.length;

	            list.next = newtable[hash];
	            newtable[hash] = list;
	            list = next;
	         }
	      }
	      table = newtable;  // Replace the table with the new table.
	   } // end resize()



}
