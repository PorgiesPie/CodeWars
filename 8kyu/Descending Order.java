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
