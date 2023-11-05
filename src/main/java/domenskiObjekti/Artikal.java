/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domenskiObjekti;

import java.io.Serializable;

/**
 *
 * @author agro
 */
public class Artikal implements Serializable{
    
    private int artikalId;
    private String naziv;
    private String opis;
    private double cena;

    public Artikal() {
    }

    public Artikal(int artikalId, String naziv, String opis, double cena) {
        this.artikalId = artikalId;
        this.naziv = naziv;
        this.opis = opis;
        this.cena = cena;
    }

    

    public int getArtikalId() {
        return artikalId;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setArtikalId(int artikalId) {
    	if (artikalId<=0) throw new IllegalArgumentException();
        this.artikalId = artikalId;
    }

    public void setNaziv(String naziv) {
    	if (naziv==null) throw new NullPointerException();
    	if (naziv.length()<3) throw new IllegalArgumentException();
        this.naziv = naziv;
    }

    public void setCena(double cena) {
     	if (cena<=0) throw new IllegalArgumentException();
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return naziv+" "+cena;
    }
}
