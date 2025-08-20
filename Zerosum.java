import java.util.*;

public class Zerosum
 {
    public static void main(String[] args) 
    {
        int[] a = {1, 2, -3, 3, -1, 2};
        int n = a.length;

        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) 
       {
            int sum = 0;
            for (int j = i; j < n; j++) 
            {
                sum += a[j];
                if (sum == 0) 
                {
                    result.add("(" + i + ", " + j + ")");
                }
            }
        }

        System.out.println(result);
    }
}