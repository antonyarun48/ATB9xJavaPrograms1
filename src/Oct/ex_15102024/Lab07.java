package Oct.ex_15102024;

public class Lab07 {
    public static void main(String[] args) {
        int a = 10;      // 11   11    12
        System.out.println(++a + a++ + a++);//[11(1+10)+11+(11+1)12]//a=12+1=13
        // ++a=1+10=11;First part
        // a++=11 only 'a' take,remaining 1 add with third part 'a';Second part
        // a++=12(a++=11+1)=12;Third part
        //a=last a++=12+1=13(a's value)
        System.out.println(a);
    }
}