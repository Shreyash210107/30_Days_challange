public class Duplicatenumber 
{ 
  public static int duplicate(int[]a)
   {
     int slow = a[0];
     int fast = a[0];
     
      do
       { 
         slow = a[slow];
         fast = a[a[fast]];
        }
       while(slow != fast);
       slow = a[0];
       while(slow != fast)
       {
         slow = a[slow];
         fast = a[fast];
        }
     return slow;
    }
  public static void main(String[] args)
   {
     int[] a = {3,1,3,4,2};
     System.out.println("Duplicate number:"+duplicate(a));
   }
}  