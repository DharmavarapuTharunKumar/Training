import java.util.Scanner;

public class EmployeePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many years you have been in company ?");
        int year = sc.nextInt();
        if(year >= 5){
            System.out.println("What is your rating ?");
            String rate = sc.next();
            if(rate.equals("excellent")){
                System.out.println("How many advance training have you done ?");
                int course = sc.nextInt();
                if(course >= 1){
                    System.out.println("You are eligible for promotion");
                }
                else{
                    System.out.println("You are not eligible for promotion");
                }
            }
            else{
                System.out.println("You are not eligible for promotion");
            }
        }
        else{
            System.out.println("mYou are not eligible for promotion");
        }
    }
}
