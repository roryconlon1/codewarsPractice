import java.util.*;

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

    public static void deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        List<Integer> revisedList = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            if (occurrenceMap.get(elements[i]) == null) {
                occurrenceMap.put(elements[i], 1);
            } else {
                occurrenceMap.put(elements[i], occurrenceMap.get(elements[i]) + 1);
            }
            System.out.println(occurrenceMap);
            if (occurrenceMap.get(elements[i]) <= maxOccurrences) {
                revisedList.add(elements[i]);
            }
            System.out.println(revisedList);
        }
        System.out.println(revisedList);
    }

//    public static int lonelyinteger(List<Integer> a) {
//        Map<Integer, Integer> numMap = new HashMap<>();
//        for (int i = 0; i < a.size(); i++) {
//            if (numMap.get(a.get(i)) == null) {
//                numMap.put(a.get(i), 1);
//            } else
//                numMap.put(a.get(i), (numMap.get(a.get(i))) + 1);
//        }
//        System.out.println(numMap);
//        return 2;
//    }
}
