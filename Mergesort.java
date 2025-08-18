public class Mergesort
{
  public static void main(String[] args)
  {
    int a1[] = {1,3,5,7};
    int a2[] = {2,4,6,8};
    int m = a1.length;
    int n = a2.length;
  
     for(int i =0;i<m;i++)
      {
        if(a1[i]>a2[0])
         {
           int temp = a1[i];
            a1[i] = a2[0];
            a2[0] = temp;
           int first = a2[0];
           int k;
           for(k=1;k<n &&a2[k]<first;k++)
            {
              a2[k-1]=a2[k];
            }
             a2[k-1] = first;
          }
       }
       System.out.print("Array1 = ");
       for(int x : a1)
        System.out.print(x +" ");
        System.out.println();
      System.out.print("Array2 = ");
       for(int x : a2)
      System.out.print(x + " ");
   }
}