import java.util.*;

public class FirstElement 
{
  public static int findFirstElement(int[] arr, int k) 
   {
    HashMap<Integer, Integer> freq = new HashMap<>();

    for (int num : arr) 
      {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
      }
    for (int num : arr) 
      {
      if (freq.get(num) == k)
       {
        return num;
       }
     }
    return -1;
  }

  public static void main(String[] args)
  {
    int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 4};
    int k = 2;
    int result = findFirstElement(arr, k);
    System.out.println(result); 
 }
}