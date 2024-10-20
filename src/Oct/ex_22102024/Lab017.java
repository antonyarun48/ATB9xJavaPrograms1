package Oct.ex_22102024;

public class Lab017 {
    public static void main(String[] args) {
        String str = "Helloworld";
        int y = 0, z = 0;
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
                y++;
                System.out.println("Vowels " + chr);
            } else {
                z++;
                System.out.println("Consonants " + chr);
            }

            System.out.println("Number of vowels " + y);
            System.out.println("Number of consonents " + z);
        }
    }
}