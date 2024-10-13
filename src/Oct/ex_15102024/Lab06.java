package Oct.ex_15102024;

public class Lab06 {
    public static void main(String[] args) {
        int a = 30, b = 50, c = 90;
        int result = (a > b) ? a : (b > c) ? b : c;
        System.out.println(result);
    }
}