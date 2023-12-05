/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domenskiObjekti;

import java.io.Serializable;

/**
 *
 * @author Viktor
 */
public class StavkaRacuna implements Serializable{
    private Artikal artikal;
    private int kolicina;

    public StavkaRacuna() {
    }

    public StavkaRacuna(Artikal artikal, int kolicina) {
        this.artikal = artikal;
        this.kolicina = kolicina;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Artikal getArtikal() {
        return artikal;
    }

    public void setArtikal(Artikal artikal) {
        this.artikal = artikal;
    }
   
    
}
