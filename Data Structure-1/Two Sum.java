class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
//Complexity Analysis  
//Time complexity:  O ( n ) O(n). We traverse the list containing  n n elements exactly twice. Since the hash table reduces the lookup time to  O ( 1 ) O(1), the overall time complexity is  O ( n ) O(n).  
//Space complexity:  O ( n ) O(n). The extra space required depends on the number of items stored in the hash table, which stores exactly  n n elements.
