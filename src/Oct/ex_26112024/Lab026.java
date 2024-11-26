package Oct.ex_26112024;

import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        boolean isPalindrome=true;
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                isPalindrome=false;
            }
        }
       if(isPalindrome){
           System.out.println(s+ " is palindrome");
       }
       else{
           System.out.println(s+ " is not palindrome");
       }
    }

}
