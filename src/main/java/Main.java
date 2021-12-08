import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        class Minimal {

            int min = Integer.MAX_VALUE;
            Stack<Integer> stack = new Stack<>();

            public void push(int x) {
                if (x <= min) {
                    stack.push(min);
                    min = x;
                }
                stack.push(x);
            }

            public void pop() {
                if (stack.pop() == min) {
                    min = stack.pop();
                }
            }

            public int peekMin() {
                return min;
            }
        }
    }
}