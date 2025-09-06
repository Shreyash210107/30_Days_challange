import java.util.*;

public class SlideWindowMaximum
 {
    
    public static int[] maxSlideWindow(int[] arr, int k) 
        {
        if (arr == null || k <= 0) {
            return new int[0];
        }
        
        int n = arr.length;
        int[] result = new int[n - k + 1];
        int index = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++)
        {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) 
            {
                dq.pollFirst();
            }
            
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) 
            {
                dq.pollLast();
            }
            
            dq.offerLast(i);
           
            if (i >= k - 1) 
            {
                result[index++] = arr[dq.peekFirst()];
            }
        }
        
        return result;
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] output = maxSlideWindow(arr, k);
        System.out.println(Arrays.toString(output));
    }
}
