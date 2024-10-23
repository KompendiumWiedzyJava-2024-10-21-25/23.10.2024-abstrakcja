package com.comarch.szkolenia.abstrakcja;

public abstract class KlasaAbstrakcyjna {
    private int x;
    private String cos;

    public KlasaAbstrakcyjna(int x, String cos) {
        this.x = x;
        this.cos = cos;
    }

    public KlasaAbstrakcyjna() {
    }

    public void zwyklaMetoda() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

    public abstract void metoda();
}
