import java.util.*;

public class Primefactorization
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to factorize: ");
        int n = sc.nextInt();

        System.out.print("Prime factors: ");
        for (int i = 2; i <= n; i++) 
        {
            while (n % i == 0) 
            {
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }
}
