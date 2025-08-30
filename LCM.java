import java.util.Scanner;
public class LCM
{
 public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter First Number:");
    int n=sc.nextInt();
    System.out.println("Enter Second Number:");
      int m=sc.nextInt();
    int lcm;
   lcm=(n>m)? n:m;
   while (true)
  {
     if (lcm % n==0 && lcm % m ==0)
      {
        System.out.println("LCM = "+ lcm);
         break;
      }
   lcm++;
  }
 }
}    