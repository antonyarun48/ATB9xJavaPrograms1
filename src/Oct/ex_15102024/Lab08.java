package Oct.ex_15102024;

public class Lab08 {
    public static void main(String[] args) {
        int a = 20;      //19    19    20
        System.out.println(--a + a++ + a--);
        // --a->1-20=19;
        // a++=19 only print;19+1=20 will print on thirt part
        // a-- ->20 only 'a' take...20-1(a--)will print on next println
        System.out.println(a); // 19
    }
}
