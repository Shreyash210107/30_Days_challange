import java.util.Scanner;
public class Divisorcount
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number:");
    int N=sc.nextInt();
    int count = 0;
    for (int i= 1 ;i*i<=N;i++)
     {
       if (N % i == 0)
        {
          if(i == N / i)
          {
            count++;
          }
        else
          {
             count += 2;
          }
        }
    }
  System.out.println("Total number of Divisors:" + count);
 }
}
       