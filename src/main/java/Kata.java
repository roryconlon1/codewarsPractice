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
}

