class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] postfix = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] result = new int[nums.length];
        int pref = 1;
        int post = 1;

        for (int i = 0; i < nums.length; i++){
            prefix[i] = pref;
            pref *= nums[i];
        }

        for (int i = nums.length-1; i >= 0; i--){
            postfix[i] = post;
            post *= nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            result[i] = postfix[i] * prefix[i];
        }

        return result;
    }
}  
