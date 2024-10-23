package com.comarch.szkolenia.abstrakcja;

public class BardzoWaznaKlasa extends Parent implements SimpleInterface, SecondInterface {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sayName() {
        System.out.println("Janusz");
        System.out.println(Constants.PASSWORD);
    }

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public void setBrand(String brand) {
        System.out.println("Ustawiam marke !!!");
    }

    @Override
    public void method() {

    }
}
