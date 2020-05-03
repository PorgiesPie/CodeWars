// Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
// Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
// If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

public class YourOrder {
    public static String order(String words) {

        String arr[] = words.split(" ");
        String temparr[] = new String[arr.length];
        StringBuilder sb = new StringBuilder();
        
        if (words.isEmpty()){
            return "";
        }
        
        for (int i = 0; i < arr.length; i++){
           String j = arr[i].replaceAll("\\D+","");
           temparr[Integer.parseInt(j) - 1] = arr[i];
        }
        
        for (int i = 0; i < arr.length; i++){
            sb.append(temparr[i]);
            if (i != arr.length - 1){
                sb.append(" ");
            }
        }
        
        return sb.toString();

    }
}
