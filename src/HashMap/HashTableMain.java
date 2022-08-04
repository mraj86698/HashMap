package HashMap;

public class HashTableMain {
	public static void main(String args[]) {
		System.out.println("Welcome to HashTable");
		HashTable hash=new HashTable();
	      while (true) {

	         System.out.println("1. WordCounter");
	         System.out.println("2. Find Frequency Of Word in Para");
	         System.out.println("3. Remove Avoidable Word");
	        System.out.print("Enter your Option:  ");
	         switch ( Utility.inputInteger()) {

	         case 1:
	        	 //String s = "To be or not to be";
	        	 hash.wordCount();
	        	 break;
	         case 2:
	        	 //String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
	        	 hash.findFrequency();
	        	 break;
	         case 3:
	        	 String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
	 	         String word = "avoidable";
	        	 hash.removeAvoidable(str, word);
	         default:
	            System.out.println("   Illegal command.");
	         break;
	         }

	      }
	}

}
