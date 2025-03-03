class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // firrst fond suffix
        int[] prefix = new int[n];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = product;
            product *= nums[i];
        }
        int[] sufix = new int[n];
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            sufix[i] = product;
            product *= nums[i];
        }
        int[] solution = new int[n];
        for (int i = 0; i < n; i++) {
            solution[i] = prefix[i] * sufix[i];
        }
        return solution;
    }
}