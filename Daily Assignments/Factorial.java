
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to do Factorial");
        int num = sc.nextInt();
        int fact = 1;

        for(int i = num; i > 0; --i) {
            fact *= i;
        }

        String var4 = "Factorial of the number " + num + " is " + fact;
        System.out.println(fact);
    }
}

