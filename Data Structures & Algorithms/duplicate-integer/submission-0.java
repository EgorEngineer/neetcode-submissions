class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unduplicatedNums = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        if(unduplicatedNums.size() == nums.length)
            return false;
        return true;
    }
}