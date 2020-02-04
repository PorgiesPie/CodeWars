import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeightSort {

    public static String orderWeight(String string) {
        StringBuilder sb = new StringBuilder();
        String [] arr = string.split(" ");
        List<String[]> list = new ArrayList<>();
        Arrays.sort(arr);

        for (String weight : arr) {
            String[] combined = new String[2];
            combined[0] = weight;
            int revisedWeight = 0;
            for (int i = 0; i < weight.length(); i++) {
                revisedWeight += Character.getNumericValue(weight.charAt(i));
            }
            combined[1] = String.valueOf(revisedWeight);
            list.add(combined);
        }

        Collections.sort(list,new Comparator<>() {
            public int compare(String [] strings, String [] otherStrings) {
                return Integer.compare(Integer.parseInt(strings[1]), Integer.parseInt(otherStrings[1]));
            }
        });

        for (String[] ad : list) {
            sb.append(ad[0]).append(" ");
        }

        return removeLastChar(sb.toString());
    }

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }
}
