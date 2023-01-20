import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        int m, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez deux nombre : ");

        m = sc.nextInt();

        n = sc.nextInt();

        if ((m > 0 && n > 0) || (m < 0 && n < 0)) {

            System.out.println("Leur produit est positif");

        } else {

            System.out.println("Leur produit est négatif");
        }
        sc.close();
    }
}
