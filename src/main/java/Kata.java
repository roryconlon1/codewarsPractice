import java.util.*;
import java.util.stream.IntStream;

public class Kata {

    public Kata() {
    }

    public static String rps(String p1, String p2) {
        if (p1 == "rock" && p2 == "scissors") {
            return "Player 1 won!";
        } else if (p1 == "scissors" && p2 == "paper") {
            return "Player 1 won!";
        } else if (p1 == "paper" && p2 == "rock") {
            return "Player 1 won!";
        } else if (p1 == p2) {
            return "Draw!";
        } else {
            return "Player 2 won!";
        }
    }

    public static String maskify(String str) {
        int length = str.length();
        if (length > 3) {
            String end = str.substring(length - 4, length);
            String start = str.substring(0, length - 4).replaceAll(".", "#");
            return start + end;
        }
        return str;
    }

    public static int getCount(String str) {
        int total = 0;
        String string = str.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                total += 1;
            }
        }
        return total;
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed == true && vacation == false) {
            return true;
        }
        return false;
    }

    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    //    IntStream was correct on codewars and Arrays.stream didn't work.
    public static int max(int[] list) {
        return IntStream.of(list).max().getAsInt();
    }

    public static boolean isPal(int num) {
        String numToString = Integer.toString(num);
        for (int i = 0; i < numToString.length(); i++) {
            int size = numToString.length() / 2;
            String first = numToString.substring(0, size);
            String second = numToString.substring(size, numToString.length());
            StringBuilder sb = new StringBuilder(second);
            String secondReversed = sb.reverse().toString();
            if (first.equals(secondReversed)) {
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        String hello = helloWorld();
//        System.out.println(hello);
//        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
//        int[] sorted = sortedNumber(arr);
//        System.out.println(Arrays.toString(sorted));
//    }

    public static String helloWorld() {
        return "Hello World";
    }

    public static int[] sortedNumber(int[] num) {
        Arrays.sort(num);
        return num;

    }

    public static int sumNumber(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }

    public static int strCount(String str, char letter) {
        char[] string = str.toCharArray();
        Integer total = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == letter) {
                total += 1;
            }
        }
        return total;
    }

    public static int[] reverse(int n) {
        int[] numberList = new int[n];
        for (int i = 0; i < n; i++) {
            numberList[i] = n - i;
        }
        return numberList;
    }

    public static int expressionsMatter(int a, int b, int c) {

        int[] myArray = {a + b + c, a * b * c, a + b * c, a * b + c, (a + b) * c, a * (b + c)};
        int max = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public static String reverseWords(final String original) {
        String[] listOfWords = original.split(" ");
        String reverseString = "";
        for (int i = 0; i < listOfWords.length; i++) {
            String word = listOfWords[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        if (original.trim().length() > 0) {
            return reverseString.trim();
        } else if (original.isEmpty()) {
            return reverseString.trim();
        }
        return reverseString + "   ";
    }

    public static String findNeedle(Object[] haystack) {
        String needle = "needle";
        int position = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                position = i;
            }
        }
        return "found the needle at position " + position;
    }

    public static int sum(int[] numbers) {

        if (numbers == null || numbers.length < 2) {
            return 0;
        }

        int lowest = numbers[0];
        int highest = numbers[0];
        int sum = 0;
        for (int i : numbers) {
            lowest = Math.min(lowest, i);
            highest = Math.max(highest, i);
            sum += i;
        }

        return sum - lowest - highest;
    }


    public static int[] minMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int[] minimumAndMaximum = {min, max};
        return minimumAndMaximum;
    }

    public static boolean checkForFactor(int base, int factor) {
        if (base % factor == 0) {
            return true;
        }
        return false;
    }

    //    find odd one out in array, sort elements, if 1 == 2 then return last one otherwise return 1st one
    public static int stray(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers[0] == numbers[1]) {
            return numbers[numbers.length - 1];
        } else {
            return numbers[0];
        }
    }

    public static int[] map(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int a = 0; a < arr.length; a++) {
            int i = arr[a] * 2;
            arr2[a] = i;
        }
        return arr2;
    }

    public static int otherAngle(int angle1, int angle2) {
        return 180 - angle1 - angle2;
    }

    public static int areaOrPerimeter(int l, int w) {
        return l == w ? l * w : (l + w) * 2;
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null) {
            return null;
        } else if (phrase.length() > 0) {
            List<String> stringList = new ArrayList<>();
            String[] words = phrase.toLowerCase().split(" ");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                stringList.add(String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1));
            }
            //StringBuilder also works, stringbuffer is threading safe as is synchronized
            //but overkill to have synchro in single thread so although similar timing in this string builder is better
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < stringList.size(); i++) {
                sb.append(stringList.get(i) + " ");
            }
            String str = sb.toString().replaceFirst("\\s++$", "");
            return str;
        }
        return null;
    }

    public static String greet(String language) {
        Map<String, String> languageGreeting = new HashMap<>();
        languageGreeting.put("english", "Welcome");
        languageGreeting.put("czech", "Vitejte");
        languageGreeting.put("dutch", "Welkom");
        languageGreeting.put("danish", "Velkomst");
        languageGreeting.put("estonian", "Tere tulemast");
        languageGreeting.put("finnish", "Tervetuloa");
        languageGreeting.put("flemish", "Welgekomen");
        languageGreeting.put("french", "Bienvenue");
        languageGreeting.put("german", "Willkommen");
        languageGreeting.put("irish", "Failte");
        languageGreeting.put("italian", "Benvenuto");
        languageGreeting.put("latvian", "Gaidits");
        languageGreeting.put("lithuanian", "Laukiamas");
        languageGreeting.put("polish", "Witamy");
        languageGreeting.put("spanish", "Bienvenido");
        languageGreeting.put("swedish", "Valkommen");
        languageGreeting.put("welsh", "Croeso");

//        return languageGreeting.containsKey(language) ? languageGreeting.get(language) : "Welcome";

//        codewars solution, getOrDefault, if key is not existent will default to 2nd arg
//        literally 2nd arg, so either can be a String, ie this doesn't exist, or this case default to english
//        so better to get english from hashmap by its key
        return languageGreeting.getOrDefault(language, languageGreeting.get("english"));
    }

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
//        reduce has 2 arguments start and running total, start at 1 and times by each number in the array
//        needs to start at 1 for multiplication, 0 for addition

        int first = Arrays.stream(firstCuboid).reduce(1, (a, b) -> a * b);
        int second = Arrays.stream(secondCuboid).reduce(1, (a, b) -> a * b);
        return first > second ? first - second : second - first;
    }
//        codewars one, tried first *= for each cuboid at postion i for each iteration
//        int first = 1;
//        int second = 1;
//        for (int i = 0; i < firstCuboid.length; i++) {
//            first *= firstCuboid[i];
//            second *= secondCuboid[i];
//        }
//        return first > second ? first - second : second - first;
//    }

    public static boolean getXO(String str) {
//        new map to make str char array, all lowercase string to char count consistent
        Map<Character, Integer> charCount = new HashMap<>();
        char[] charArray = str.toLowerCase().toCharArray();
//        for each char get its key and increment value by 1
//        or if key doesn't exist, put a new key of char in and initialise at 1
        for (char i : charArray) {
            if (charCount.containsKey(i)) {
                charCount.put(i, charCount.get(i) + 1);
            } else {
                charCount.put(i, 1);
            }
        }
        return charCount.get('x') == charCount.get('o');
    }

    public static int paperWork(int n, int m) {
        if (n < 0 || m < 0) {
            return 0;
        } else {
            return n * m;
        }
    }

    public static int nthPower(int[] array, int n) {
        if (array.length >= n + 1) {
            return (int) Math.pow(array[n], n);
        }
        return -1;
    }

    public static int arithmetic(int a, int b, String operator) {
        if (operator == "multiply") {
            return a * b;
        } else if (operator == "subtract") {
            return a - b;
        } else if (operator == "divide") {
            return a / b;
        }
        return a + b;
    }

    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("nah");
        }
        return n > 0 ? n * factorial(n - 1) : 1;
    }

    public static boolean isTriangle(int a, int b, int c) {
//        if (a + b > c || a + c > b || b + c > a)
//        first one doesn't work as will execute if one of the conditions is met
//        want to check all conditions so need to swap round what looking for
//        if a + b > c it will execute even if a + c !> b
//        therefore need to check if any don't satisfy the criteria and if one of them doesn't it will be true
//        however as its opposite we want it to return as false
        return !(a + b <= c || a + c <= b || b + c <= a);
//        if (a + b <= c || a + c <= b || b + c <= a) {
//            return false;
//        }
//        return true;
//        or could do opposite and see if all conditions are met with &&
//        return a + b > c && a + c > b && c + b > a;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 2, 8, 9, 8, 4, 6, 8, 3};
        highLow(arr);
    }

    public static void highLow(int[] nums) {
        int[] sortedArr = Arrays.stream(nums).sorted().toArray();
        System.out.println(sortedArr[0]);
        System.out.println(sortedArr[nums.length - 1]);
//        System.out.println(Arrays.stream(nums).max());
//        System.out.println(Arrays.stream(nums).min());

        Map<Integer, Integer> occurence = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (occurence.get(nums[i]) == null) {
                occurence.put(nums[i], 1);
            } else {
                occurence.put(nums[i], occurence.get(nums[i]) + 1);
            }
        }
        int biggestKey = 0;
        int biggestValue = 0;
        for (Integer key : occurence.keySet()) {
            if (occurence.get(key) > biggestValue) {
                biggestKey = key;
                biggestValue = occurence.get(key);
            }
        }
        System.out.println(biggestKey);
        System.out.println(occurence);
    }

    public static int sequence(int[] arr) {
        int total = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        return total;
    }

//    public static boolean isPrime(int num) {
//        if (num < 2) {
//            return false;
//        }
//        List<Integer> listOfNums = new ArrayList<>();
//        for (int i = 1; i < num + 1; i++) {
//            listOfNums.add(i);
//        }
//        for (int n = 2; n < listOfNums.size(); n++) {
//            if (num % n == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
//        non prime numbers need to be divisible by a number before or at square root
//        easier to loop over numbers in sqrt than all numbers and saves on memory
        for (int n = 2; n < Math.sqrt(num) + 1; n++) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
//        make map of each occurrence of number in an array
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
//        make new list to store nums if under occurrence in original
        List<Integer> revisedList = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
//            if doesn't exist in map add to map otherwise increment value by 1
            if (occurrenceMap.get(elements[i]) == null) {
                occurrenceMap.put(elements[i], 1);
            } else {
                occurrenceMap.put(elements[i], occurrenceMap.get(elements[i]) + 1);
            }
//            once in map, if the value for the key is <= to the max occurrence then add to the new list
//            otherwise it won't be added
            if (occurrenceMap.get(elements[i]) <= maxOccurrences) {
                revisedList.add(elements[i]);
            }
//            a number will always be added to the map however if it exceeds the max occurrence then
//            the last check will not pass and so will not run/won't be added.
        }
        return revisedList.stream().mapToInt(Integer::valueOf).toArray();
    }

    //    public static int solveSuperMarketQueue(int[] customers, int n) {
//        int total = 0;
//        for (int i = 0; i < customers.length; i++) {
//            total += customers[i];
//        }
//        return total / n;
//    }
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] result = new int[n];
        for (int i = 0; i < customers.length; i++) {
            result[0] += customers[i];
            System.out.println(Arrays.toString(result));
            Arrays.sort(result);
            System.out.println(Arrays.toString(result));
        }
        return result[n - 1];
    }

    public static String minValOfArr(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.println(min);
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return "the smallest number is " + min + "\n" + "the largest number is " + max;
    }
}

