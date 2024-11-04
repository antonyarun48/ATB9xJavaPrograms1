package Oct.ex_30102024;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        //n->row;j->column
        for(int i=0;i<=n;n--){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
