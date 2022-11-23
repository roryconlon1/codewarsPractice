import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mock {

    public static String testIDE() {
        return "Hello World";
    }

    public static Boolean pallindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        String reverse = sb.reverse().toString();
        if (word.equals(reverse)) {
            return true;
        }
        return false;
    }


//    You are given a positive integer.
//    For each number between 0 and that number, I'd like you to return a map, where the key is "Fizz" if the number is divisible by 3, and "Buzz" if the number is divisible by 5.
//
//    For example, if I gave you the number 14, the result would look like this:
//            •	Fizz: 3, 6, 9, 12
//            •	Buzz: 5, 10

    public Map<String, Integer> fizzBuzz(Integer num) {
        Map<String, Integer> fizzBussMap = new HashMap<>();
        if (num % 3 == 0){
            fizzBussMap.put("Fizz", num);
        } else if (num % 5 == 0) {
            fizzBussMap.put("Buzz", num);
        }
        return fizzBussMap;
    }


}
