import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // Step 1: Create a map for Roman numeral values
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Step 2: Conversion logic
        int sum = 0;
        int i = 0;

        while (i < s.length() - 1) {
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (current < next) {
                sum += next - current;
                i++; // Skip next character
            } else {
                sum += current;
            }
            i++; // Move to next character
        }

        // Add the last character if not already processed
        if (i == s.length() - 1) {
            sum += map.get(s.charAt(i));
        }

        return sum;
    }
}
