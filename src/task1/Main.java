package task1;

public class Main {
    public static void main(String[] args) {
        final Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        final int size = stack.size();

        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());

        }
    }
}
