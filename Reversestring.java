public class Reversestring
{ 
  public static void main(String[] args)
  {
    String s="The sky is blue";
    String[] words=s.trim().split("\\s+");
     String result="";
      for(int i=words.length-1 ; i >= 0 ; i--)
      {
        result+=words[i];
        if(i>0) result +=" ";
      }
   System.out.println(result);
  }
}