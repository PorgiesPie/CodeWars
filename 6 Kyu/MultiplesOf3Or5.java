// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
//    Note: If the number is a multiple of both 3 and 5, only count it once.

import java.util.*;
public class MultiplesOf3Or5 {

  public int solution(int number) {
    HashSet<Integer> set = new HashSet<>();
    int sum = 0;
    
    for (int i = 1; i < number; i++){
      if(i % 3 == 0){
        set.add(i);
      } else if (i % 5 == 0){
        set.add(i);
      }
    }
    
    for (int num : set){
      sum += num;
    }
    
    return sum;
  }
}
