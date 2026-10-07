public class Solution {
    public String minRemoveToMakeValid(String s) {

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        boolean[] remove = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            else if (s.charAt(i) == ')') {

                if (!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    remove[i] = true;
                }
            }
        }

        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}