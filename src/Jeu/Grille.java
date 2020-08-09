package Jeu;

public class Grille {

    private int nbLigne;
    private int nbCol;
    private char[][] grille;

    public Grille() {
    }

    public Grille(int l, int c) {
        this.nbLigne = l;
        this.nbCol = c;
        this.grille = new char[l][c];
        for (int i = 0; i < nbLigne; i++) {
            for (int j = 0; j < nbCol; j++) {
                this.grille[i][j] = '.';
            }
        }
    }

    public void afficher() {
        System.out.println();
        // Remplissage de la grille
        for (int i = 0; i < nbLigne; i++) {
            for (int j = 0; j < nbCol; j++) {
                System.out.print(" | " + grille[i][j]);
            }
            System.out.println(" |");
        }
    }

    // Placer un charactere  dans la grille
    public void placer(int l, int c, char t) {
        l = l - 1;
        c = c - 1;
        if (l < 0 || c < 0 || l > nbLigne || c >= nbCol) {
            System.err.println("ERREUR, svp vérifiez vos paramètres d'entrée !");
            return; // pour sortir/quitter de cette fonction
        }
        if (grille[l][c] == '.') { // On verifie d'abord si la grille si la grille est vide
            grille[l][c] = t;
        } else {
            System.err.println("Erreur de placement :cette zone n'est pas vide !");
        }
    }

    // Retourne la case correspondante à ligne et col
    public char getCase(int ligne, int col) {
        return grille[ligne - 1][col - 1];
    }

    // deplacer()

}
