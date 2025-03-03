import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return list;

        int start = 0;
        while (start < nums.length) {
            int end = start;

            // Find the last index of the consecutive sequence
            while (end + 1 < nums.length && nums[end + 1] == nums[end] + 1) {
                end++;
            }

            // Add to the result list
            if (start == end) {
                list.add(String.valueOf(nums[start]));
            } else {
                list.add(nums[start] + "->" + nums[end]);
            }

            // Move to the next range
            start = end + 1;
        }
        return list;
    }
}