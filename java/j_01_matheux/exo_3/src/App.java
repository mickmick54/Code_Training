import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     * 
     * Variables a, b, c en Caratères
     * Début
     * Ecrire "Ecrivez successivement trois noms :"
     * Lire a, b, c
        * Si a < b ET b < c Alors
        *      Ecrire "Ces noms sont classés alphabétiquement"
        * Sinon
        *      Ecrire "Ces noms ne sont pas classés"
        * Finsi
     * Fin
     */
    public static void main(String[] args) throws Exception {

        String a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ecrivez successivement trois noms : ");

        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();

        if (a.compareTo(b) < 0 && b.compareTo(c) < 0) {

            System.out.println("Ces noms sont classés alphabétiquement");
        } else {

            System.out.println("Ces noms ne sont pas classés");
        }
        sc.close();
    }
}
