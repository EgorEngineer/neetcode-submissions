class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        int[] result = new int[k];

        for(int i=0; i<nums.length;i++)
        {
            numsMap.put(nums[i],numsMap.getOrDefault(nums[i],0)+1);
        }

        List<Integer> sortedKeys = numsMap.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        for(int i = 0 ; i < k; i++)
        {
            result[i] = sortedKeys.get(i);
        }

        return result;
    }
}
