package com.comarch.szkolenia.abstrakcja.przyklad;

public class AlgorytmDB extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("Wczytjue z bazy ...");
    }

    @Override
    public void zapiszDane() {
        System.out.println("Zapisuje do bazy ...");
    }
}
