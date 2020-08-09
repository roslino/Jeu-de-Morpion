package Jeu;

public class TestPersonnage {

    public static void main(String[] args) {

        /*        System.out.println("Veuillez entrer un nombre");
        Scanner sc1 = new Scanner(System.in);
        int nb = sc1.nextInt();
        System.out.println("Vous avez entrer : " + nb);

        System.out.println("Veuillez entrer une chaine");
        Scanner sc2 = new Scanner(System.in);
        String ch = sc2.nextLine();
        System.out.println("Vous avez entrer : " + ch);
        */

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
