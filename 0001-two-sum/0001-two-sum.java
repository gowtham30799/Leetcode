class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for (int i = 0; i<nums.length;i++) {
            int complement = target - nums[i];

            if(hm.containsKey(complement)) {
                res[0] = i;
                res[1] = hm.get(complement);
            }

            hm.put(nums[i],i);

        }

        /*for (int i=0; i<nums.length-1; i++) {

            for(int j=i+1;j<nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    res[0] = i;
                    res[1] = j;
                    

                }
            }
        }*/
       return res;
        
    }
}