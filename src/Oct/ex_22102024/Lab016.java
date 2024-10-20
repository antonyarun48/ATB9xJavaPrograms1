package Oct.ex_22102024;

public class Lab016 {
    public static void main(String[] args) {
      int n=12345;
      int n1=0;
      int n2=0;
      for(int i=0;n>0;i++){
          n1=n%10;
          n=n/10;
          n2=n1+n2*10;
          System.out.println(n1);
          System.out.println(n2);
      }
    }
}
