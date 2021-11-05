package Singleton;

public class SingletonKlasse {

    
    public int x;

    private static SingletonKlasse singleton = null; // Objekt/Klasseninstanz


    //Methode liefert immer das gleiche Objekt zrück, beim ersten Aufruf wird das Objekt initialisiert
    public static SingletonKlasse getInstance() {

        if(singleton == null) {
            singleton = new SingletonKlasse();
        }
        return singleton;
    }

    //private Konstruktor - keine Objekte außerhalb erzeugbar
    private SingletonKlasse() {

    }
    
}
