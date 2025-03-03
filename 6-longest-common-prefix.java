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
