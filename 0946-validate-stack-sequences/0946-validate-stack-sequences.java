class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        java.util.Stack<Integer> S = new java.util.Stack<>();

        int i = 0;

        for (int input : pushed) {

            S.push(input);

            while (!S.isEmpty() && S.peek() == popped[i]) {
                S.pop();
                i++;
            }
        }

        return S.isEmpty();
    }
}