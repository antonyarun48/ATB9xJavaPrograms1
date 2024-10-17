package Oct.ex_17102024;

import java.util.Scanner;

public class Lab012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of side A");
        int side1=sc.nextInt();
        System.out.println("Enter the length of side B");
        int side2=sc.nextInt();
        System.out.println("Enter the length of side C");
        int side3=sc.nextInt();
        if (side1==side2 && side2==side3){
            System.out.println("Equilateral");
        }
        else if(side1!=side2 && side2!=side3 && side3!=side1){
            System.out.println("Scalene");
        }
        else
        {
            System.out.println("Isosceles");
        }
    }
}
