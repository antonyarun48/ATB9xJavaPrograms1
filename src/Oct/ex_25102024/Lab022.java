package Oct.ex_25102024;

public class Lab022 {
    public static void main(String[] args) {
        String s1="Arun"; //scp->String pool constant
        String s4="Arun";
        String s2=new String("Umar"); //OA->Object Area
        String s3=new String("Abdullah");
        String s5=new String("Umar");
        String s6=new String("uMAR");
        //==(Comparison)->Check reference location(memory)
        System.out.println(s1==s4);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s5);
        System.out.println(s2==s5);

        //equals->Only check content(value)in the name of string
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s5));
        System.out.println(s2.equalsIgnoreCase(s6));

    }
}
