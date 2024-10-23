package com.comarch.szkolenia.abstrakcja.przyklad;

public class App {
    public static void main(String[] args) {
        Algorytm algorytm = new AlgorytmDB();
        algorytm.oblicz();

        Algorytm algorytm2 = new AlgorytmPlikowy();
        algorytm2.oblicz();
    }
}
