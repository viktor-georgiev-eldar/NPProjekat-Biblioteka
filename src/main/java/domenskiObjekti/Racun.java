/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domenskiObjekti;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Predstavlja racun unutar sistema koji sadrzi informacije o korisniku, stavkama racuna i ukupnom iznosu.
 * 
 * @author Viktor
 */
public class Racun implements Serializable{
    
    /**
     * Identifikator racuna
     */
    private int RacunId; 
    /**
     * Korisnik koji je izdao racun
     */
    private Korisnik korisnik; 
    /**
     * Lista stavki na racunu
     */
    private List<StavkaRacuna> listaStavki;
    /**
     * Ukupan iznos racuna.
     */
    private double ukupno; 
    /**
     * Datum izdavanja racuna
     */
    private LocalDateTime datum;

    /**
     * Konstruktor bez argumenata.
     */
    public Racun() {
    }

    /**
     * Konstruktor sa argumentima.
     * 
     * @param racunId Identifikator racuna
     * @param korisnik Korisnik koji je izdao racun
     * @param listaStavki Lista stavki na racunu
     */
    public Racun(int racunId, Korisnik korisnik, List<StavkaRacuna> listaStavki) {
        this.RacunId = racunId;
        this.korisnik = korisnik;
        this.listaStavki = listaStavki;
    }

    /**
     * Vraca listu stavki na racunu.
     * 
     * @return Lista stavki na racunu
     */
    public List<StavkaRacuna> getListaStavki() {
        return listaStavki;
    }

    /**
     * Postavlja listu stavki na racunu.
     * 
     * @param listaStavki Lista stavki na racunu
     * @throws NullPointerException Ako je lista stavki null
     */
    public void setListaStavki(List<StavkaRacuna> listaStavki) {
        if (listaStavki == null) throw new NullPointerException();
        this.listaStavki = listaStavki;
    }

    /**
     * Vraca identifikator racuna.
     * 
     * @return Identifikator racuna
     */
    public int getRacunId() {
        return RacunId;
    }

    /**
     * Postavlja identifikator racuna.
     * 
     * @param racunId Identifikator racuna
     * @throws IllegalArgumentException Ako je identifikator racuna manji od nule
     */
    public void setRacunId(int racunId) {
        if (racunId < 0) throw new IllegalArgumentException();
        this.RacunId = racunId;
    }

    /**
     * Vraca korisnika koji je izdao racun.
     * 
     * @return Korisnik koji je izdao racun
     */
    public Korisnik getKorisnik() {
        return korisnik;
    }

    /**
     * Postavlja korisnika koji je izdao racun.
     * 
     * @param korisnik Korisnik koji je izdao racun
     * @throws NullPointerException Ako je korisnik null
     */
    public void setKorisnik(Korisnik korisnik) {
        if (korisnik == null) throw new NullPointerException();
        this.korisnik = korisnik;
    }

    /**
     * Vraca ukupan iznos racuna.
     * 
     * @return Ukupan iznos racuna
     */
    public double getUkupno() {
        return ukupno;
    }

    /**
     * Postavlja ukupan iznos racuna.
     * 
     * @param ukupno Ukupan iznos racuna
     */
    public void setUkupno(double ukupno) {
        this.ukupno = ukupno;
    }

    /**
     * Vraca datum izdavanja racuna.
     * 
     * @return Datum izdavanja racuna
     */
    public LocalDateTime getDatum() {
        return datum;
    }

    /**
     * Postavlja datum izdavanja racuna.
     * 
     * @param datum Datum izdavanja racuna
     */
    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }


    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Racun other = (Racun) obj;
        if (this.RacunId != other.RacunId) {
            return false;
        }
        return true;
    }
    
    
    
}
