import java.util.*;
public class CountSubstring
{
  public static void main(String[] args)
  {
    String s = "pqpqs";
    int k = 2;
    int n = s.length();
    int count = 0;
       for (int i = 0;i<n;i++)
       {
         Set<Character> set = new HashSet<>();
           for (int j = i;j<n; j++)
            {
              set.add(s.charAt(j));
              if (set.size()==k)
              {
                 count++;
              }
                else if (set.size() > k)
              {
                    break;
               }
            }
        }
      System.out.println("Count = "+count);
   }
}