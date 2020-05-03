// Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in
//descending order. Essentially, rearrange the digits to create the highest possible number.

import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    int number = num;
    String[] arr = new String[String.valueOf(num).length()];
    
  if (num == 0) return 0;
    
  int i = 0;
  while (number > 0) {      
      arr[i] = Integer.toString(number%10);
      number /= 10;
      System.out.println(arr[i]);
      i++;
  }
  
  Arrays.sort(arr, Collections.reverseOrder());
  String result = "";
  
  for (String s : arr) {
    result += s;
  }
  
  return Integer.parseInt(result);
  
  }
}
