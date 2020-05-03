// Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings.
// All words must have their first letter capitalized without spaces.

public class CamelCase {

    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");

        if (str.length() == 0){
            return "";
        } else if (str.length() == 1){
            str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
            return str;
        } else {

            for (String s : arr) {
                if (s.length() == 0) {
                    continue;
                } else {
                    String temp = s;
                    temp = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
                    sb.append(temp);
                }
            }
        }

        return sb.toString().strip();
    }

}
