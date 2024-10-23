package com.comarch.szkolenia.abstrakcja.przyklad;

public abstract class Algorytm {

    public void oblicz() {
        wczytajDane();
        liczenieKrok1();
        liczenieKrok2();
        liczenieKrok3();
        zapiszDane();
    }

    public abstract void wczytajDane();

    private void liczenieKrok1() {
        System.out.println("Liczenie - krok 1 ...");
    }

    private void liczenieKrok2() {
        System.out.println("Liczenie - krok 2 ...");
    }

    private void liczenieKrok3() {
        System.out.println("Liczenie - krok 3 ...");
    }

    public abstract void zapiszDane();
}
