package hu.flowacademy.harcosokklubja;

public class Harcos {

    private int utoero;
    private int egeszseg;
    private String name;

    public Harcos(int utoero, int egeszseg, String name) {
        this.utoero = utoero;
        this.egeszseg = egeszseg;
        this.name = name;
    }

    public void megut(Harcos fighter){
        System.out.println(this.toString() + fighter.toString());
        fighter.egeszseg -= this.utoero;
        System.out.println(this.getName() + " megütötte " + fighter.getName() + "t, így " + fighter.getName() + " egészsége " + fighter.getEgeszseg() + "-ra csökkent.");
    }

    // A harcosnak legyen egy megut()publikus metódusa, ami nem ad vissza értéket, egy másik Harcos-t vár paraméterül, és a
    // paraméterként kapott Harcosnak az egészségéből levonja az aktuális harcos ütőerejét. Írja ki a metódus, hogy a harcos
    // megütötte a másikat, ehhez felhasználva a megírt toString() metódust. Helyezd a Harcos osztályt harcosokklubja csomagba!

    public int getUtoero() {
        return utoero;
    }

    public void setUtoero(int utoero) {
        this.utoero = utoero;
    }

    public int getEgeszseg() {
        return egeszseg;
    }

    public void setEgeszseg(int egeszseg) {
        this.egeszseg = egeszseg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName() + " vagyok, ütőerőm: " + this.getUtoero() + ", egészségem: " + this.getEgeszseg() + ". ";
    }


}

// 1.) Készíts egy Harcos nevű osztályt.
// Egy harcosnak tároljuk el az ütőerejét, és az egészségét. Ezek legyenek privát láthatóságú adattagok, egész értékű
// számok. Ezekhez írjunk publikus lekérdező és módosító metódusokat. A Harcosnak legyen egy olyan konstruktora, ami paraméterül
// várja ezt a két értéket. Default konstruktor ne legyen. Definiáljuk felül az osztályban a toString() metódust, és írjuk ki az
// adattagjai értékét, pl.: “Harcos vagyok, ütőerőm: [ütőerő], egészségem: [egészség].”. A harcosnak legyen egy megut()publikus
// metódusa, ami nem ad vissza értéket, egy másik Harcos-t vár paraméterül, és a paraméterként kapott Harcosnak az egészségéből
// levonja az aktuális harcos ütőerejét. Írja ki a metódus, hogy a harcos megütötte a másikat, ehhez felhasználva a megírt
// toString() metódust. Helyezd a Harcos osztályt harcosokklubja csomagba!
