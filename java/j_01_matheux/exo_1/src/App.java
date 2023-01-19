import java.util.Random;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
		
		int nb;
		int nbJoueur = 0;
		int borneMin = 0;
		int borneMax = 100;
		int nbEssais = 0;
		
		Random aleatoire = new Random();
	      
	    nb = aleatoire.nextInt(101);
		
		Scanner sc = new Scanner(System.in);
		
		while (nb != nbJoueur) {
			
			System.out.println("Choisissez un nombre entre " + borneMin + " et " + borneMax);
			
			nbJoueur = sc.nextInt();
			
			if (nb == nbJoueur) {
				System.out.println("Vous avez gagné en " + nbEssais + " essais");
			}
			else if (nb < nbJoueur) {
				System.out.println("C'est moins");
				borneMax = nbJoueur - 1;
			}
			else {
				System.out.println("C'est plus");
				borneMin = nbJoueur + 1;
			}
			nbEssais++;
		}
		sc.close();
	}
}
