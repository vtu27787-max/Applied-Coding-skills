class MyQueue {

    java.util.Stack<Integer> S1;
    java.util.Stack<Integer> S2;

    public MyQueue() {
        S1 = new java.util.Stack<>();
        S2 = new java.util.Stack<>();
    }

    public void push(int x) {
        S1.push(x);
    }

    public int pop() {

        while (!S1.isEmpty()) {
            S2.push(S1.pop());
        }

        int ans = S2.pop();

        while (!S2.isEmpty()) {
            S1.push(S2.pop());
        }

        return ans;
    }

    public int peek() {

        while (!S1.isEmpty()) {
            S2.push(S1.pop());
        }

        int ans = S2.peek();

        while (!S2.isEmpty()) {
            S1.push(S2.pop());
        }

        return ans;
    }

    public boolean empty() {
        return S1.isEmpty();
    }
}