package Oct.ex_16102024;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.next();
        System.out.println("Enter your Age");
        int age=sc.nextInt();
        System.out.println("Enter your Salary");
        int salary=sc.nextInt();
        System.out.println("Your name " +name);
        System.out.println("Your Age "+age);
        System.out.println("Your Salary "+salary);
        sc.close();
    }
}
