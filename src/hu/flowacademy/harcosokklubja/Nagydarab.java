package hu.flowacademy.harcosokklubja;

public class Nagydarab extends Harcos {

    private int allokepesseg;

    public Nagydarab(int utoero, int egeszseg, String name, int allokepesseg) {
        super(utoero, egeszseg, name);
        this.allokepesseg = allokepesseg;
    }

    /* @Override
    public void setEgeszseg(int egeszseg) {
        this.egeszseg = this.allokepesseg + egeszseg;
    } */

    @Override
    public int getEgeszseg() {
        return super.getEgeszseg() + this.allokepesseg;
    }

    public int getAllokepesseg() {
        return allokepesseg;
    }

    public void setAllokepesseg(int allokepesseg) {
        this.allokepesseg = allokepesseg;
    }

    @Override
    public String toString() {
        return super.toString() + " Állóképességem: " + getAllokepesseg() + ", Nagydarab harcos vagyok.";
    }


}

// Legyen szintén a harcosokklubja csomagban egy Nagydarab nevű osztály is, ami származzon a Harcosból.
// A Harcos adattagjain kívül legyen egy szintén privát állóképesség adattagja, ez is legyen lekérdezhető és beállítható
// publikus metódusokon keresztül. A Nagydarab osztály egészségének lekérdezésekor mindig adódjon hozzá az állóképessége
// is a visszaadott értékhez. A Nagydarab osztálynak is legyen paraméteres konstruktora, amiben bekéri az adattagjai értékét.
// Használjuk fel a konstruktorban a ősosztály konstruktorát is! Írjuk felül a toString() metódust, ami hívja meg a ősosztály
// ugyanilyen metódusát is, és ezen kívül még írja ki, hogy egy Nagydarab harcosról van szó, valamint hogy mennyi az állóképessége.

