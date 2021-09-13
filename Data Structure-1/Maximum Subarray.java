class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize our variables using the first element.
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];
        
        // Start with the 2nd element since we already used the first one.
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }
        
        return maxSubarray;
    }
}

//Complexity Analysis  
//Time complexity:  O ( N ) O(N), where  N N is the length of nums.  We iterate through every element of nums exactly once.  
//Space complexity:  O ( 1 ) O(1)  No matter how long the input is, we are only ever using 2 variables: currentSubarray and maxSubarray.
