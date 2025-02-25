class Solution {
    public int findClosestNumber(int[] nums) {
        //Check the absolute position witht the 0 and the one will less is the one and returen the largest value
        int output = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(Math.abs(nums[i]) < Math.abs(output)){
                output = nums[i];
            }
            //checking if both are equal so pick the greater
            else if(Math.abs(output)==Math.abs(nums[i]) && nums[i] > output ){
                output=nums[i];
            }
            
        }
        return output;

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, -1, 1};
        System.out.println("Closest number to zero in nums1: " + solution.findClosestNumber(nums1)); // Output: 1

        int[] nums2 = {-4, -2, 1, 4, 8};
        System.out.println("Closest number to zero in nums2: " + solution.findClosestNumber(nums2)); // Output: 1

        int[] nums3 = {2, -2, -3, 3};
        System.out.println("Closest number to zero in nums3: " + solution.findClosestNumber(nums3)); // Output: 2

        int[] nums4 = {0, 1, 2};
        System.out.println("Closest number to zero in nums4: " + solution.findClosestNumber(nums4)); // Output: 0
    }
}