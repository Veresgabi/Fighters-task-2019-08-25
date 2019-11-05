package hu.flowacademy;

import hu.flowacademy.harcosokklubja.Harcos;
import hu.flowacademy.harcosokklubja.Nagydarab;

public class Fight {

    public static void meccs(Harcos h1, Harcos h2) {
        System.out.println(h1.getName() + " - " + h2.getName());
        int tempH1 = h1.getEgeszseg();
        int tempH2 = h2.getEgeszseg();
        h1.megut(h2);
        h2.megut(h1);
        h1.megut(h2);
        h2.megut(h1);
        h1.megut(h2);
        h2.megut(h1);
        if ((h1.getEgeszseg() <= 0 && h2.getEgeszseg() <= 0) || (h1.getEgeszseg() > 0 && h2.getEgeszseg() > 0)) {
            System.out.println("Az eredmény döntetlen lett");
        } else if (h1.getEgeszseg() > 0 && h2.getEgeszseg() <= 0) {
            System.out.println((h1.getName() + " győzött"));
        } else if (h2.getEgeszseg() > 0 && h1.getEgeszseg() <= 0) {
            System.out.println((h2.getName() + " győzött"));
        }
        h1.setEgeszseg(tempH1);
        h2.setEgeszseg(tempH2);
    }

    public static void createFighters(String... args) {
        int counter = 0;
        int j = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("Harcos") || args[i].equals("Nagydarab")) {      // Megszámolja, hogy hány objektum jön létre a bemeneti argomentumok által
                counter++;
            }
        }
        Harcos[] array = new Harcos[counter];       // A megszámolt objektumoknak megfelelő méretű tömböt hozunk létre.
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("Nagydarab")) {      // Ha az args i-edik eleme "Nagydarab", létrehoz egy Nagydarab objektumot a tömb j-edik elemeként
                array[j] = new Nagydarab(Integer.parseInt(args[i + 1]), Integer.parseInt(args[i + 2]), args[i + 3], Integer.parseInt(args[i + 4]));
                j++;
            } else if (args[i].equals("Harcos")) {   // Ha az args i-edik eleme "Harcos", létrehoz egy Harcos objektumot a tömb j-edik elemeként
                array[j] = new Harcos(Integer.parseInt(args[i + 1]), Integer.parseInt(args[i + 2]), args[i + 3]);
                j++;
            }
        }
        int k = 0;
        if (array.length >= 2) {            // Ha van legalább 2 Harcosunk, azokra legyen meghívva a meccs() metódus
            while (k < array.length - 1) {
                meccs(array[k], array[k + 1]);
                k++;
            }
        }
    }

    public static void countObjects(String[] arrrr) {       // Ellenőrzésképpen kiírattam a létrehozott objektumok (harcosok) számát
        int counter = 0;
        for (int i = 0; i < arrrr.length; i++) {
            if (arrrr[i].equals("Harcos") || arrrr[i].equals("Nagydarab")) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void printArr(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
        countObjects(args);
        createFighters(args);
        }
}
// Írjunk egy csomagon kívüli futtatható osztályt! Az osztály rendelkezzen egy statikus meccs(Harcos h1, Harcos h2) metódussal,
// melynek nincs visszatérési értéke. Ezen belül először írjuk ki, melyik két harcos küzd, aztán a harcosok felváltva megütik
// egymást háromszor a saját megut() metódusukkal. A meccs végén ha mindkettőnek elfogyott az egészsége, vagy egyiknek sem,
// akkor döntetlen. Ha csak az egyiknek a kettejük közül, akkor a másik harcos győzött. A meccs eredményét írjuk ki a képernyőre
// (azt is, hogy melyik harcos győzött, ha győzött valaki). A futtatható osztályban a parancssori argumentumokat bejárva hozzuk
// létre a harcosainkat: ha az aktuális argumentum "Harcos", akkor a következő két paraméter alapján hozzunk létre Harcos
// objektumot, ha az aktuális argumentum "Nagydarab", akkor a következő három paraméter alapján hozzunk létre egy Nagydarab
// objektumot! Tároljuk ezeket egy tömbben. Tartsuk nyilván, hogy hány objektumot hoztunk létre, és ha ez legalább kettő,
// akkor indítsunk egy meccset: kezdetben az első két Harcost adjuk át neki, majd a másodikat, harmadikat, majd a harmadikat,
// negyediket, stb…
