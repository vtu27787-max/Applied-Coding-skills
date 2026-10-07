class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];
            while (!s.isEmpty() && s.peek() <= current) {
                s.pop();
            }
            if (s.isEmpty()) {
                map.put(current, -1);
            } else {
                map.put(current, s.peek());
            }
            s.push(current);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}