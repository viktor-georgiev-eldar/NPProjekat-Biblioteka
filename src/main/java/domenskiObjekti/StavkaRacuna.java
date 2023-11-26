/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domenskiObjekti;

import java.io.Serializable;

/**
 * Predstavlja stavku na racunu koja sadrzi određeni artikal i kolicinu.
 * 
 * @author Viktor
 */
public class StavkaRacuna implements Serializable {
    /**
     * Artikal koji se nalazi na racunu
     */
    private Artikal artikal;
    /**
     * Kolicina artikla koji se nalazi na racunu
     */
    private int kolicina;

    /**
     * Konstruktor bez parametara za stavku racuna.
     */
    public StavkaRacuna() {
    }

    /**
     * Konstruktor koji postavlja artikal i kolicinu za stavku racuna.
     * 
     * @param artikal   Artikal koji se nalazi u stavki racuna
     * @param kolicina  Kolicina tog artikla u stavci racuna
     */
    public StavkaRacuna(Artikal artikal, int kolicina) {
        this.artikal = artikal;
        this.kolicina = kolicina;
    }

    /**
     * Vraca kolicinu artikla u stavci racuna.
     * 
     * @return Kolicina artikla
     */
    public int getKolicina() {
        return kolicina;
    }

    /**
     * Postavlja kolicinu artikla u stavci racuna.
     * 
     * @param kolicina Kolicina artikla
     * @throws IllegalArgumentException Ako je kolicina manja od nule
     */
    public void setKolicina(int kolicina) {
        if (kolicina < 0) throw new IllegalArgumentException();
        this.kolicina = kolicina;
    }

    /**
     * Vraca artikal koji se nalazi u stavci racuna.
     * 
     * @return Artikal u stavci racuna
     */
    public Artikal getArtikal() {
        return artikal;
    }

    /**
     * Postavlja artikal u stavci racuna.
     * 
     * @param artikal Artikal koji se dodaje u stavku racuna
     * @throws NullPointerException Ako je artikal null
     */
    public void setArtikal(Artikal artikal) {
        if (artikal == null) throw new NullPointerException();
        this.artikal = artikal;
    }
}