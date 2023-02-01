import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRank {

    public HackerRank() {
    }

    public static int groupDivision(List<Integer> levels, int maxSpread) {
        Collections.sort(levels);
        int count = 0;
        int storedVal = levels.get(0);
        System.out.println(levels);

        for (int i = 0; i < levels.size(); i++) {
            if (storedVal == levels.get(i)) {
                storedVal = levels.get(i);
            } else if (levels.get(i) >= (storedVal + maxSpread) || levels.get(i) <= (storedVal - maxSpread)) {
                count += 1;
                storedVal = levels.get(i);
            }
        }
        return count;
    }

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.size(); i++) {
            min += arr.get(i);
            max += arr.get(i);
        }
        min -= arr.get(arr.size() - 1);
        max -= arr.get(0);
        System.out.println(min + " " + max);
    }

    public static String timeConversion(String s) {
        char[] charArray = s.toCharArray();
        int pOrA = charArray.length - 2;
        if (charArray[pOrA] == 'P' && charArray[1] == '2' && charArray[0] == '1') {
        } else if (charArray[pOrA] == 'P') {
            charArray[0] += 1;
            charArray[1] += 2;
        } else if (charArray[pOrA] == 'A' && charArray[1] == '2') {
            charArray[0] -= 1;
            charArray[1] -= 2;
        }
        char[] finalCharArray = Arrays.copyOfRange(charArray, 0, pOrA);
        String string = new String(finalCharArray);
        return string;
    }
}
