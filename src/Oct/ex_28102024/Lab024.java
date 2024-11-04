package Oct.ex_28102024;

public class Lab024 {
    public static void main(String[] args) {
        String name="Arun Antony Prasad";
        String name1="Hello";
        String name2="hello";
        //length
        System.out.println(name.length());
        System.out.println(name==name1);
        System.out.println(name1==name2);
        //equals
        System.out.println(name1.equals(name2));
        System.out.println(name.equals(name2));
        //equalsIgnoreCase
        System.out.println(name1.equalsIgnoreCase(name2));
        //toLowerCase
        System.out.println(name1.toLowerCase());
        //toUpperCase
        System.out.println(name1.toUpperCase());
        //subString
        System.out.println(name.substring(5,11));
        //charAt
        char c=name.charAt(3);
        System.out.println(c);
        //replace
        System.out.println(name.replace('r','9'));
        System.out.println(name.replace("Arun","Umar"));
        //replaceAll
        System.out.println(name.replaceAll("Arun Antony","Umar Abdullah"));
        //Concatenation
        System.out.println(name1.concat(name2));
        //contains
        boolean b=name.contains("Anto");
        System.out.println(b);
        //trim->remove unnecessary space
        String v="     Hello VJ";
        String a1 = v.trim();
            System.out.println(v);
            System.out.println(a1);
        //split->print one by one
        String a[]=name.split(" ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //indexOf
        System.out.println(name.indexOf('A'));
        //lastIndexOf
        System.out.println(name.lastIndexOf('r'));
        //toCharArray
        char ar[]=name.toCharArray();
        for(int i=0;i<ar.length;i++) {
        System.out.println(ar[i]);
        }
        //equals function in Object Area(OA)
        String s=new String("Umar");
        String s1=new String("Umar");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
    }
}
