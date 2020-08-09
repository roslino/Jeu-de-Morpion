package Jeu;

public class TestPersonnage {

    public static void main(String[] args) {

        Grille g = new Grille(12, 8);

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
