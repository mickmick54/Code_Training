import java.util.Scanner;

public class App {

    public static void main(String[] args) {
		
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Choisissez un nombre ");

		n = sc.nextInt();

		if (n > 0) {

			System.out.println("Ce nombre est positif");

		} else {

			System.out.println("Ce nombre est négatif");
		}
		sc.close();
	}
}
