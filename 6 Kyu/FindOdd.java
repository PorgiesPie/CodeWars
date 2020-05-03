// Given an array, find the integer that appears an odd number of times.
// There will always be only one integer that appears an odd number of times.

import java.util.HashMap;

public class FindOdd {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;


        for (int number : a) {
            Integer count = map.get(number);
            if (count == null){
                map.put(number, 1);
            } else  {
                map.put(number, count + 1);
            }
        }
        for (int key : map.keySet()){
            if ((map.get(key) % 2) != 0){
                result = key;
            }
        }

        return result;
    }
}
