
/**
 * 
 * @author Julien Pozzani et Achille Guillon
 *
 */
public class Main {

	public static void main(String[] args) {

	    Bibliotheque.initBibliotheque(); // Initialise le contrôleur et la base de données
	     
	 //   UIConsole.menuPrincipal(); // Lancement de l'interface utilisateur
	     
	    Bibliotheque.closeBibliotheque(); // Execute les sauvegardes et ferme la base
     
	}

}
