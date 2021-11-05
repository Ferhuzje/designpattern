package Singleton;

//import Singleton.SingletonKlasse;



public class Programm {
    public static void main(String[] args) throws Exception {
        
        // Singleton Beispiel
        // Da der KOnstruktor private ist, kann außerhalb kein Objekt erzeugt werden
        //SingletonKlasse singleton = new SingletonKlasse();
        //wäre beides das gleiche Objekt
        SingletonKlasse singleton1 = SingletonKlasse.getInstance();
        singleton1.x = 100;
        SingletonKlasse singleton2 = SingletonKlasse.getInstance();
        singleton2.x = 200;
        System.out.println(singleton1.x);
        System.out.println(singleton2.x);
    }
}
