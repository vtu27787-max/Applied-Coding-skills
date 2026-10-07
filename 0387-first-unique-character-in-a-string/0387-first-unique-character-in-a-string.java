class Solution {
    public int firstUniqChar(String s) {
        int[] h = new int[26];
        int i;
        for (i = 0; i < s.length(); i++) {
            h[s.charAt(i) - 'a']++;
        }
        for (i = 0; i < s.length(); i++) {
            if (h[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}