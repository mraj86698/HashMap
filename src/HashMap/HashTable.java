package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashTable {

	public void wordCount() {
		/**
		 * Declaring a HashMap of <String, Integer> Splitting the string and storing the array.
		 * The word as key and its occurrence as value in the HashMap.
		 * Incrementing the value the word is already present in the HashMap.
		 */

		String str = "TO BE OR NOT TO BE";
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

	public void findFrequency() {
		/**
		 * Declaring a HashMap of <String, Integer>
		 *  The word as key and its occurrence as value in the HashMap.
		 *  Incrementing the value the word is already present in the HashMap.
		 *  To Remove White Spaces.
		 *  Each Index to store the words and its frequency.
		 */

		String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
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

		// code to remove whitespaces
		String newStr = str.replaceAll(" ", "");

		Map<Character, Integer> numCount = new HashMap<Character, Integer>(Math.min(newStr.length(), 26));

		System.out.println("The count is: ");
		for (int i = 0; i < newStr.length(); i++) {
			char charAt = newStr.charAt(i);
			if (!numCount.containsKey(charAt)) {
				numCount.put(charAt, 1);
			} else {
				numCount.put(charAt, numCount.get(charAt) + 1);
			}
		}
		System.out.println(numCount);

	}

}
