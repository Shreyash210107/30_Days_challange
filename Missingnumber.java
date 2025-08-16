public class Missingnumber
{ 
  public static void main(String[]args)
   {
     int[]a={1,2,4,5};
     int n=a.length+1;
     int total=n*(n+1)/2;
     int sum=0;
       for(int i=0;i<a.length;i++)
         {
           sum=sum + a[i];
         }
      int missing = total-sum;
       System.out.println("Missing number:"+missing);
    }
}