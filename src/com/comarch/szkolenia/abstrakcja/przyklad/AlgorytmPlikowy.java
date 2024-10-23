package com.comarch.szkolenia.abstrakcja.przyklad;

public class AlgorytmPlikowy extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("Wczytywanie z pliku ...");
    }

    @Override
    public void zapiszDane() {
        System.out.println("Zapis do pliku ...");
    }
}
