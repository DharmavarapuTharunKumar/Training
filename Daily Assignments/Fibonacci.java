import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequece till you want to see fibonacci");
        int num = sc.nextInt();
        System.out.print(0+ " "+ 1+ " ");
        int prev2 = 0;
        int prev = 1;
        int fib = 0;
        for(int i=3; i <= num; i++){
            fib = prev+prev2;
            prev2 = prev;
            prev = fib;
            System.out.print(fib + " ");
        }
    }
}
