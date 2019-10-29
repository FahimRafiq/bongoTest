import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args){

        String con = "y";
        Scanner sc = new Scanner(System.in);

        while(con.equals("y")){
            System.out.println("Enter first String: ");
            char[] a = sc.nextLine().toLowerCase().replaceAll("\\s","").toCharArray();

            System.out.println("Enter second  String: ");
            char[] b = sc.nextLine().toLowerCase().replaceAll("\\s","").toCharArray();

            Boolean ans = anagramFind(a,b);
            System.out.println("Anagram: "+ans);

            System.out.println("Continue? Y/N");
            con = sc.nextLine().toLowerCase();
        }

    }

    private static boolean anagramFind(char[] a, char[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(a);
        System.out.println(b);

        return Arrays.equals(a, b);
    }
}
