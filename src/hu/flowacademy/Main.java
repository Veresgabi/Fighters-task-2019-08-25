package hu.flowacademy;

import hu.flowacademy.harcosokklubja.Harcos;
import hu.flowacademy.harcosokklubja.Nagydarab;

public class Main {

    public static void main(String[] args) {

        Harcos bela = new Harcos(300, 600, "Béla");
        Harcos joska = new Harcos(200, 500, "Jóska");
        Nagydarab pista = new Nagydarab(400, 700, "Pista", 300);

        System.out.println(bela.toString());
        System.out.println(pista.getEgeszseg());
        System.out.println(pista.toString());

        bela.megut(joska);
    }
}
