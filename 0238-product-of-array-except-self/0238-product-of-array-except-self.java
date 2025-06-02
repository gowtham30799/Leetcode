class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] res_arr = new int[nums.length];

        res_arr[0] = 1;

        for (int i = 1; i<nums.length; i++){
            res_arr[i] = res_arr[i-1] * nums[i-1];            

        }

        int rp = 1;
        for(int i=nums.length-1;i>=0;i--){
            res_arr[i] = rp * res_arr[i];
            rp *= nums[i];           
        }

        return res_arr;
    }
}