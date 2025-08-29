import java.util.HashSet;

public class LongestSubstring 
{
    public static void main(String[] args) 
   {
        String s = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, maxLen = 0;

        while (j < s.length())
      {
            if (!set.contains(s.charAt(j)))
        {
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
        } else 
            {
                set.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println("Longest substring length: " + maxLen);
    }
}
