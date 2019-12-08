// Write a function that takes an array of numbers (integers for the tests) and a target number.
// It should find two different items in the array that, when added together, give the target value.
// The indices of these items should then be returned in a tuple like so: (index1, index2).
// For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
// The input will always be valid.

import java.util.*;
public class Solution
{
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        if (numbers.length == 2) {
            result[0] = numbers[0];
            result[1] = numbers[1];
        } else {

            for (int i = 0; i < numbers.length; i++) {
                map.put(i, numbers[i]);
            }

            for (int key : map.keySet()){
                for (int key2 : map.keySet()){
                    if (map.get(key) + map.get(key2) == target){
                        result[0] = key;
                        result[1] = key2;
                    }
                }
            }
        }

        return result;
    }
}
