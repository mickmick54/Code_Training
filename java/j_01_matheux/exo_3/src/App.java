import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        String a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ecrivez successivement trois noms : ");

        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();

        if ((a < b) && (b < c)) {

            System.out.println("Ces noms sont classés alphabétiquement");
        } else {

            System.out.println("Ces noms ne sont pas classés");
        }
    }
}
