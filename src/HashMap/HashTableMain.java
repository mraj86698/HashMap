package HashMap;

public class HashTableMain {
	public static void main(String args[]) {
		System.out.println("Welcome to HashTable");
		HashTable table = new HashTable(2);  // Initial size of table is 2.
	      String key,value;
	      while (true) {
	         System.out.println("\nMenu:");
	         System.out.println("   1. Insert a Key Value )");
	         System.out.println("   2. Display Hash Table");


	         System.out.print("Enter your Option:  ");
	         switch ( Utility.inputInteger()) {
	         case 1:
	            System.out.print("\n Enter the  Key : ");
	            key = Utility.inputString();
	            System.out.print("   Enter the Value : ");
	            value = Utility.inputString();
	            table.put(key,value);
	            break;
	         case 2:
		            table.display();
		            break;

	         default:
	            System.out.println("   Illegal command.");
	         break;
	         }
	         System.out.println("\nHash table size is " + table.size());
	      }
	}

}
