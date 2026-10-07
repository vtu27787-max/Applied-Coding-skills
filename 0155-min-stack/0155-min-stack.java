class MinStack {

    java.util.Stack<Integer> S;
    java.util.Stack<Integer> MS;

    MinStack() {
        S = new java.util.Stack<>();
        MS = new java.util.Stack<>();
    }

    void push(int val) {

        S.push(val);

        if (MS.isEmpty() || val <= MS.peek()) {
            MS.push(val);
        }
    }

    void pop() {

        if (S.peek().equals(MS.peek())) {
            MS.pop();
        }

        S.pop();
    }

    int top() {
        return S.peek();
    }

    int getMin() {
        return MS.peek();
    }
}