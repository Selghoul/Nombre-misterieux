package MonPackage;

public class Nombremystere {

	public static void main(String[] args) {
		
			 // Declarations des variables
			 String Joueur1, Joueur2;
			 int Nbmyst, rep, Cpt;

			 // Saisie des informations par les utilisateurs
			 System.out.println("Bienvenue dans le jeu du nombre mystere");
			 
			 Joueur1 = Saisie.lire_String("Joueur1 veuillez rentrer votre pseudo");
			 Joueur2 = Saisie.lire_String("Joueur2 veuillez rentrer votre pseudo");

			 Nbmyst = Saisie.lire_int(Joueur1 + " Veuillez saisir votre nombre mystere compris entre 1 et 100");


			 // Traitement
			 while ((Nbmyst < 1) || (Nbmyst > 100)) {
			 Nbmyst = Saisie.lire_int(" Votre nombre n'est pas correct, il doit etre compris entre 1 et 100.");
			}

			 // Joueur2 tente de trouver le nombre mystere

			Cpt = 0;
			rep = 0;

			 System.out.println(Joueur2 + " C'est maintenant à vous de trouver le nombre mystere choisi par " +Joueur1+ " Ce nombre est compris entre 1 et 100 mais attention vous ne disposez que de 10 essais, à vous de jouer.");
			while (Cpt < 10 && Nbmyst != rep) {
			 rep = Saisie.lire_int("Veuillez saisir un nombre");
			 if (Nbmyst == rep) {

			Cpt = Cpt+1;

			 System.out.println(" Waouh Félicitations " +Joueur2+ "Vous avez découvert le nombre mystere en " +Cpt+ " essai(s)");
			}
			 else {
			 if (Nbmyst < rep) {

			Cpt = Cpt+1;

			 System.out.println("Malheureusement ce nombre est trop haut, retentez votre chance, vous en êtes à " +Cpt+ " essai(s)");
			}

			else {
			Cpt = Cpt+1;

			 System.out.println(" Malheureusement ce nombre est trop bas, retentez votre chance, vous en êtes à " +Cpt+ "essai(s)");
			}
			}
			if (Cpt == 10) {

			 System.out.println(" Dommage vous avez épuisé toutes vos chances, le nombre mystere etait " +Nbmyst+ ".");
			}
			}

			 

			 

			 

			 

			 

			 

			 

			 

			 

			 


			 

			}


			 

			}
