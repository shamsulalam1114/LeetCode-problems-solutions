import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int sum = 0;
        
        // Populate the map with Roman numeral values
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        // Replace subtractive combinations with additive ones
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        
        // Calculate the integer value of the Roman numeral
        for (int i = 0; i < s.length(); i++) {
            sum += map.get(s.charAt(i));
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String s1 = "III";
        System.out.println("Example 1: " + solution.romanToInt(s1)); // Output: 3

        // Example 2
        String s2 = "LVIII";
        System.out.println("Example 2: " + solution.romanToInt(s2)); // Output: 58

        // Example 3
        String s3 = "MCMXCIV";
        System.out.println("Example 3: " + solution.romanToInt(s3)); // Output: 1994
    }
}
