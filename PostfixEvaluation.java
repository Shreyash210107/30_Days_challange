import java.util.*;

public class PostfixEvaluation 
{
    public static void main(String[] args) 
    {
        String expr = "2 1 + 3 *";  
        Stack<Integer> stack = new Stack<>();

        for (String token : expr.split(" ")) 
        {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) 
             {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                if (token.equals("+")) result = a + b;
                else if (token.equals("-")) result = a - b;
                else if (token.equals("*")) result = a * b;
                else if (token.equals("/")) result = a / b; 

                stack.push(result);
            } else 
            {
                stack.push(Integer.parseInt(token));
            }
        }

        System.out.println("Result: " + stack.pop());
    }
}