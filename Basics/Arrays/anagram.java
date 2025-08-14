import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    public void checkAnagram()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string 1");
        String s1 = sc.next();
        System.out.println("enter string 2");
        String s2 = sc.next();

        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 != len2)
        {
            System.out.println("not anagram");
        }
        else
        {
            char [] s1char = s1.toCharArray();
            char [] s2char = s2.toCharArray();

            Arrays.sort(s1char);
            Arrays.sort(s2char);

            if(Arrays.equals(s1char,s2char))
            {
                System.out.println("anagram");
            }
            else
            {
                System.out.println("not anagram");
            }

        }
    }

    public static void main(String[] args) {

        anagram a = new anagram();
        a.checkAnagram();

    }
}
