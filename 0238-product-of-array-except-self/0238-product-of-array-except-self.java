class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] lft_arr = new int[nums.length];
        int[] rgt_arr = new int[nums.length];

        lft_arr[0] = 1;
        rgt_arr[nums.length-1] = 1;

        for (int i = 1; i<nums.length; i++){
            lft_arr[i] = lft_arr[i-1] * nums[i-1];            

        }
        for(int i=nums.length-2;i>=0;i--){
            rgt_arr[i] = rgt_arr[i+1] * nums[i+1];
            
        }

        for(int i =0; i< nums.length; i++) {
            nums[i] = lft_arr[i] * rgt_arr[i];
        }

        return nums;  
    }
}