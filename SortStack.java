import java.util.Stack;
public class SortStack
{
     static void
      insertSorted(Stack<Integer>stack,int num)
       {
          if (stack.isEmpty() || stack.peek() <= num)
           {
             stack.push(num);
              return;
            }
            int top = stack.pop();
            insertSorted(stack, num);
            stack.push(top);
       }
     static void sortStack(Stack<Integer>stack)
      {
         if(stack.isEmpty())
         {
           return;
         }
        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
      } 
  public static void main(String[] args)
 {
   Stack<Integer> stack = new Stack<>();
      stack.push(3);
      stack.push(1);
      stack.push(4);
      stack.push(2);
    System.out.println("Original Stack: " + stack);
      sortStack(stack);
    System.out.println("Sorted Stack:" +stack);
 }
}