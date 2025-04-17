class Solution {
    public boolean isAnagram(String s, String t) {
        char[] crr = s.toCharArray();
        char[] crr1 = t.toCharArray();

        Arrays.sort(crr);
        Arrays.sort(crr1);

        return Arrays.equals(crr,crr1);


        
    }
}