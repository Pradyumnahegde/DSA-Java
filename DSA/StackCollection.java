import java.util.Stack;
public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack);
        int p = stack.pop();
        System.out.println(p);
        System.out.println(stack);
        stack.push(30);
        stack.push(40);
        int a = stack.peek();
        System.out.println(a);
        boolean check = stack.empty();
        System.out.println(check);
    }
}
