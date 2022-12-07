package Zajecia.Gra;

import java.util.Random;

public class Czlowiek {
    private int zycie;
    private int exp;
    private int obrazenia;


    Czlowiek(int zycie, int exp, int obrazenia) {
        this.zycie = zycie;
        this.exp = exp;
        this.obrazenia = obrazenia;

    }


    public int lecznie(int leczenie) {
        this.zycie += leczenie;
        return leczenie;


    }

    public void statystyka() {
        System.out.println(zycie);
        System.out.println(exp);
        System.out.println(obrazenia);


    }


    public int getZycie() {
        return zycie;
    }

    public void setZycie(int zycie) {
        this.zycie = zycie;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getObrazenia() {
        return obrazenia;
    }

    public void setObrazenia(int obrazenia) {
        this.obrazenia = obrazenia;
    }

    public void walka() {
        Random random = new Random();
        this.zycie -= random.nextInt(100);

    }
}
