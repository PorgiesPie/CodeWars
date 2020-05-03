// Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric
// digits that occur more than once in the input string.
// The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < text.length(); i++) {
            Integer count = map.get(text.toLowerCase().charAt(i));
            if (count == null){
                map.put(text.toLowerCase().charAt(i), 0);
            } else {
                map.put(text.toLowerCase().charAt(i), count + 1);
            }
        }

        for (char key : map.keySet()){
            if (map.get(key) > 0){
                result++;
            }
        }

        return result;
    }
}
