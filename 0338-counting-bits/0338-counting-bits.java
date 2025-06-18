class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;

        for(int i = 1; i<= n; i++){
            int m = i;
            int count = 0;
            while(m != 0) {
                count+= (m & 1);
                m = m >> 1;
            }
            res[i] = count;

        }
        return res;        
    }
}