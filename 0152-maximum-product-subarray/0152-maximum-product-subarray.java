class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int pre = 1, suff = 1;
        int len = nums.length;

        for(int i = 0; i<len; i++) {
            if(pre==0) pre=1;
            if(suff==0) suff=1;

            pre *= nums[i];
            suff *= nums[len-i-1];
            ans = Math.max(ans,Math.max(pre,suff));
        }
        return ans;
        
    }
}