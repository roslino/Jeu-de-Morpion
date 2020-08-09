package Jeu;

public class Grille2 {

    private int nbLigne;
    private int nbCol;
    private char[][] grille;

    public Grille2() {
    }

    public Grille2(int l, int c) {
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

    public static void main(String[] args) {
        Grille2 g = new Grille2(12, 8);

        g.placer(3, 5, 'J');
        g.placer(8, 2, 'O');
        g.placer(1, 1, 'M');
        g.placer(7, 4, 'O');
        g.placer(10, 7, 'M');
        g.placer(2, 8, 'O');
        g.placer(11, 2, 'M');

        g.afficher();
        //System.out.println("J = Joueur\nO = Objet\nM = Monstre\n. = Vide");
        int case1 = g.getCase(3, 5);
        System.out.println(g.getCase(3, 5));

    }

}
