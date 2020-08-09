package Jeu;

public class Personnage {

    private int vie;
    private int xp;

    public Personnage() {
        this.vie = 100;
        this.xp = 0;
    }

    public Personnage(int vie, int xp) {
        this.vie = vie;
        this.xp = xp;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    // *** Service ****//

    public void seReposer(int i) { //valeurs autorisées = 1,2
        /* Controle des parametres */
        if (i < 1) {
            i = 1;
            vie += 5;
            if (vie > 100) {
                vie = 100;
            }
        }
        if (i > 2) {
            i = 2;
            vie += 10;
            if (vie > 100) {
                vie = 100;
            }
        }
    }

    public int attaquer() {
        return 5;
    }

    @Override
    public String toString() {
        return "vie du personnage =" + vie + "\nXp=" + xp;
    }

}
