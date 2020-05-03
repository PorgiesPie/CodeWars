// Find the missing letter
// Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
// You will always get an valid array. And it will be always exactly one letter be missing.
// The length of the array will always be at least 2.
// The array will always contain letters in only one case.
// Example:
// ['a','b','c','d','f'] -> 'e'
// ['O','Q','R','S'] -> 'P'

import java.util.*;
public class FindTheMissingLetter
{
    public static char findMissingLetter(char[] array)
    {
        char answer = ' ';
        boolean upperCase = Character.isUpperCase(array[0]);
        int current;
        int next;

        for (int i = 0; i < array.length - 1; i++) {
            current = (int) array[i];
            next = (int) array[i + 1];
            if (next - current > 1){
                answer = (char) (current + 1);
            }

        }

        return answer;
    }
}
