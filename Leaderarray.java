public class Leaderarray
{
 public static void main(String[] args)
 {
   int[] a = {16,17,4,3,5,2};
   int n = a.length;
   int[] leaders = new int[n];
   int index = 0;
    int greaterno = a[n-1];
     leaders[index++]=greaterno;
    for(int i = n-2;i >= 0;i--)
     {
       if(a[i]>greaterno)
       {
         greaterno = a[i];
         leaders[index++]=greaterno;
        }
      }
  System.out.println("Leaders: ");
   for(int i=index-1;i>=0;i--)
    {
      System.out.print(leaders[i]+" ");
    }
  }
}

   