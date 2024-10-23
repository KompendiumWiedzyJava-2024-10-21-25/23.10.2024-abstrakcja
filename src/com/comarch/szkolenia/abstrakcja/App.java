package com.comarch.szkolenia.abstrakcja;

public class App {
    public static void main(String[] args) {
        System.out.println("shdf");
        int i = 6;
        int x = 5 * i;

        SimpleInterface s = new BardzoWaznaKlasa();
        s.sayName();

        //

        //

        System.out.println();

        s.setBrand("jakis");

        //
        //

        s.sum(3, 7);

        s.method();

        final int z;
        System.out.println("sdfh");
        z = 6;


        System.out.println(Constants.PI);

        KlasaAbstrakcyjna klasaAbstrakcyjna = new ImplemntacjaKlasyAbstrakcyjnej();
        klasaAbstrakcyjna.metoda();
        klasaAbstrakcyjna.zwyklaMetoda();
        klasaAbstrakcyjna.setX(5);
        klasaAbstrakcyjna.setCos("cos");
    }
}
