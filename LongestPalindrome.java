public class LongestPalindrome 
{
    public static String longestPalindrome(String s) 
    {
        if (s == null || s.length() < 1) return "";
        String longest = "";

        for (int i = 0; i < s.length(); i++)
        {
            String p1 = expand(s, i, i);
            if (p1.length() > longest.length())
            {
                longest = p1;
            }

            String p2 = expand(s, i, i + 1);
            if (p2.length() > longest.length())
            {
                longest = p2;
            }
        }

        return longest;
    }

    private static String expand(String s, int left, int right) 
    {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) 
        {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) 
    {
        String s = "babad";
        System.out.println("Input: " + s);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }
}
