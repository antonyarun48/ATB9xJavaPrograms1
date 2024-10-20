package Oct.ex_18102024;

import java.util.Scanner;

public class Lab013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number1");
        double d1= sc.nextDouble();
        System.out.println("Enter the Number2");
        double d2=sc.nextDouble();
        System.out.println("Enter the operator(+,-,*,/,%)");
        char c=sc.next().charAt(0);
        double result;
        switch(c){
            case '+':
                result=d1+d2;
                System.out.println("Addition of two numbers:" + d1 +"+"  + d2 + "=" +result);
                break;
            case '-':
                result=d1-d2;
                System.out.println("Subtraction of two numbers:" + d1 +"-"  + d2 + "=" +result);
                break;
            case '*':
                result=d1*d2;
                System.out.println("Addition of two numbers:" + d1 +"*"  + d2 + "=" +result);
                break;
            case '/':
                result=d1/d2;
                System.out.println("Addition of two numbers:" + d1 +"/"  + d2 + "=" +result);
                break;
            case '%':
                result=d1%d2;
                System.out.println("Addition of two numbers:" + d1 +"%"  + d2 + "=" +result);
                break;
            default:
                System.out.println("Error:Invalid operator");

        }
      sc.close();
    }
}
