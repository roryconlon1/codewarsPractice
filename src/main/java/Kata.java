import java.util.*;
import java.util.stream.IntStream;

public class Kata {

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

    public static void main(String[] args) {
        String hello = helloWorld();
        System.out.println(hello);
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        int[] sorted = sortedNumber(arr);
        System.out.println(Arrays.toString(sorted));
    }

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
            System.out.println(i);
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
}

