package assignment6;

import java.util.Stack;

public class BalancedParentheses {

    
    public static boolean isBalanced(String expr) {
        
        Stack<Character> stack = new Stack<>();

        
        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            
            if (stack.isEmpty())
                return false;
            
            char check;
            switch (ch) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr = "([{}])";

        
        if (isBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

