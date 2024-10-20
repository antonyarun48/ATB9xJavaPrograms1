package Oct.ex_18102024;

import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter the distance in Kilometers");
                double kilometers= sc.nextDouble();
                double miles= kilometers*0.621371;
                System.out.printf("Distance in miles %.2f ",miles);
                break;
            case 2:
                System.out.println("Enter the temperature in fahrenheit ");
                double fahrenheit=sc.nextDouble();
                double celsius=(fahrenheit-32)*5/9;
                System.out.printf("Temperature in celsius %.2f ",celsius);
                break;
            default:
                System.out.println("Invalid");

        }
    }
}