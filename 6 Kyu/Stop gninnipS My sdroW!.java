// Write a function that takes in a string of one or more words, and returns the same string, but with all five or more
// letter words reversed (Just like the name of this Kata). Strings passed in will consist of only
// letters and spaces. Spaces will be included onlywhen more than one word is present.
// Examples:
// spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
// spinWords( "This is a test") => returns "This is a test"
// spinWords( "This is another test" )=> returns "This is rehtona test"

public class SpinWords {

    public String spinWords(String sentence) {

        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        if (arr.length == 1){
            if (arr[0].length() > 4){
                sb.append(arr[0]);
                sb.reverse();
                result.append(sb.toString());
                sb.setLength(0);
            } else {
                result.append(arr[0]);
            }
        }

        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i].length() > 4) {
                    sb.append(arr[i]);
                    sb.reverse();
                    result.append(sb.toString());
                    sb.setLength(0);
                } else {
                    result.append(arr[i]);
                }
                if (i != arr.length - 1){
                    result.append(" ");
                }
            }
        }


        return result.toString();

    }
}
