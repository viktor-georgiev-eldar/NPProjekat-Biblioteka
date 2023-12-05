/*
 * Klasa koja predstavlja artikal.
 */
package domenskiObjekti;

import java.io.Serializable;

/**
 * Predstavlja jedan artikal sa osnovnim atributima.
 * 
 * @author Viktor
 */
public class Artikal implements Serializable{
    
    /**
     * Identifikator artikla
     */
    private int artikalId;
    /**
     * Naziv artikla
     */
    private String naziv; 
    /**
     * Opis artikla
     */
    private String opis;
    /**
     * Cena artikla
     */
    private double cena;

    /**
     * Konstruktor bez argumenata.
     */
    public Artikal() {
    }

    /**
     * Konstruktor sa argumentima.
     * 
     * @param artikalId Identifikator artikla
     * @param naziv Naziv artikla
     * @param opis Opis artikla
     * @param cena Cena artikla
     */
    public Artikal(int artikalId, String naziv, String opis, double cena) {
    	this.setArtikalId(artikalId);
    	this.setNaziv(naziv);
    	this.setOpis(opis);
    	this.setCena(cena);
    }

    /**
     * Vraća identifikator artikla.
     * 
     * @return Identifikator artikla
     */
    public int getArtikalId() {
        return artikalId;
    }

    /**
     * Vraća naziv artikla.
     * 
     * @return Naziv artikla
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Vraća cenu artikla.
     * 
     * @return Cena artikla
     */
    public double getCena() {
        return cena;
    }

    /**
     * Postavlja identifikator artikla.
     * 
     * @param artikalId Identifikator artikla
     * @throws IllegalArgumentException Ako je identifikator manji ili jednak nuli
     */
    public void setArtikalId(int artikalId) {
        if (artikalId <= 0) throw new IllegalArgumentException();
        this.artikalId = artikalId;
    }

    /**
     * Postavlja naziv artikla.
     * 
     * @param naziv Naziv artikla
     * @throws NullPointerException Ako je naziv null
     * @throws IllegalArgumentException Ako je duzina naziva manja od 3 karaktera
     */
    public void setNaziv(String naziv) {
        if (naziv == null) throw new NullPointerException();
        if (naziv.length() < 3) throw new IllegalArgumentException();
        this.naziv = naziv;
    }

    /**
     * Postavlja cenu artikla.
     * 
     * @param cena Cena artikla
     * @throws IllegalArgumentException Ako je cena manja ili jednaka nuli
     */
    public void setCena(double cena) {
        if (cena <= 0) throw new IllegalArgumentException();
        this.cena = cena;
    }

    /**
     * Vraća opis artikla.
     * 
     * @return Opis artikla
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Postavlja opis artikla.
     * 
     * @param opis Opis artikla
     */
    public void setOpis(String opis) {
        this.opis = opis;
    }

    /**
     * Prikazuje informacije o artiklu u obliku stringa.
     * 
     * @return String sa nazivom artikla i njegovom cenom
     */
    @Override
    public String toString() {
        return naziv + " " + cena;
    }
}
