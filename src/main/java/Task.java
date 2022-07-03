import java.util.*;
import java.util.stream.Stream;

public class Task {

    public static String containsFun(String[] array) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            char[] string1 = array[i].toCharArray();
            Arrays.sort(string1);
            StringBuilder indexes = new StringBuilder();

            for (int j = i + 1; j < array.length; j++) {
                char[] string2 = array[j].toCharArray();

                if (string1.length == string2.length && !result.toString().contains(j + "")) {
                    Arrays.sort(string2);

                    if (Arrays.equals(string1, string2)) {
                        indexes.append(j).append(", ");
                    }
                }
            }
            if (indexes.length() > 0) {
                indexes.deleteCharAt(indexes.length() - 2);
                result.append(array[i]).append(" = ").append(i).append(", ").append(indexes);
            }
        }


        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
