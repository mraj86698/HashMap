package HashMap;

public class HashTableMain {
	public static void main(String args[]) {
		System.out.println("Welcome to HashTable");
		HashTable hash=new HashTable();
	      while (true) {

	         System.out.println("1. WordCounter");
	        System.out.print("Enter your Option:  ");
	         switch ( Utility.inputInteger()) {

	         case 1:
	        	 String s = "To be or not to be";
	        	 hash.wordCount(s);
	        	 break;
	         default:
	            System.out.println("   Illegal command.");
	         break;
	         }

	      }
	}

}
