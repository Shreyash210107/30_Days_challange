import java.util.*;
public class Permutation
{
  static void permute(String str,String ans,HashSet<String>set)
  {
    if(str.length()==0)
    {
      set.add(ans);
       return;
    }
 for(int i=0;i<str.length();i++)
 {
   char ch=str.charAt(i);
   String rest=str.substring(0,i)+ str.substring(i+1);
    permute(rest,ans+ch,set);
  }
}
public static void main(String[] args)
 {
  String s="abc";
  HashSet<String>set=new HashSet<>();
  permute(s, "",set);
  System.out.println(set);
 }
}