class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> numsSet = new HashSet<Integer>();
        for(int num : nums){
            numsSet.add(num);
        }

        return !(numsSet.size() == nums.length);
    }
}