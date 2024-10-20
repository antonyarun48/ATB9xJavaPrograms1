package Oct.ex_22102024;

public class Lab018 {
    public static void main(String[] args) {
        String str = "WikkiW";
        String str1 = "";
        System.out.println(str.length());
        for (int i = str.length() -1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
            System.out.println(str1);
        }
        if(str.equals(str1)) {
            System.out.println("Palindrome");
        }
            else
            System.out.println("Not Palindrome");
        }
    }
