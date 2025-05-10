import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input = "hello world";

       
        Stack<Character> stack = new Stack<>();

        
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

       
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
 
    

