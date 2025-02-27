// //Write a function to find the longest common prefix string amongst an array of strings.
// //If there is no common prefix, return an empty string ""

// class Solution {
//     public static void main(String[] args) {
//         Solution solution = new Solution();
        
//         String[] strs1 = {"flower", "flow", "flight"};
//         System.out.println("Longest common prefix in strs1: " + solution.longestCommonPrefix(strs1)); // Output: "fl"
    
//         String[] strs2 = {"dog", "racecar", "car"};
//         System.out.println("Longest common prefix in strs2: " + solution.longestCommonPrefix(strs2)); // Output: ""
//     }
//     public String longestCommonPrefix(String[] strs) {
//         // Step 1: Find the shortest string in the array
//         String shortest = strs[0];
//         for (String str : strs) {
//             if (str.length() < shortest.length()) {
//                 shortest = str;
//             }
//         }
//         // Step 2: Find the longest common prefix
//         for (int i = 0; i < shortest.length(); i++) {
//             char c = shortest.charAt(i);
//             for (String str : strs) {
//                 if (str.charAt(i) != c) {
//                     return shortest.substring(0, i);
//                 }
//             }
//         }
//         return shortest;

        
//     }
// }


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Take the first string as the initial prefix
        String prefix = strs[0];

        // Iterate through the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            
            // Compare characters of prefix and strs[i]
            while (j < prefix.length() && 
                   j < strs[i].length() && 
                   prefix.charAt(j) == strs[i].charAt(j)) 
                   {
                j++;
            }

            // Update the prefix to the common substring
            prefix = prefix.substring(0, j);

            // If prefix becomes empty, return immediately
            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }
}
