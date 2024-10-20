package Oct.ex_23102024;

import java.util.Scanner;

public class Lab019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1");
        int n1=sc.nextInt();
        System.out.println("Enter the number2");
        int n2=sc.nextInt();

        int add=add_function(n1,n2);
        System.out.println(add);

        int sub=sub_function(n1,n2);
        System.out.println(sub);

        int mul=mul_function(n1,n2);
        System.out.println(mul);

        int div=div_function(n1,n2);
        System.out.println(div);
    }
    static int add_function(int n1, int n2){
      return n1+n2;
    }
    static int sub_function(int n1, int n2){
        return n1-n2;
    }
    static int mul_function(int n1,int n2){
        return n1*n2;
    }
    static int div_function(int n1, int n2){
        return n1/n2;
    }
}
