public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}

//Complexity Analysis  
//Time complexity :  O ( n ) O(n). We do search() and insert() for  n n times and each operation takes constant time.  
//Space complexity :  O ( n ) O(n). The space used by a hash table is linear with the number of elements in it.  
