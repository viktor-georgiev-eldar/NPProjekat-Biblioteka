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
 *
 * @author agro
 */
public class Racun implements Serializable{
    
    private int RacunId;
    private Korisnik korisnik;
    private List<StavkaRacuna> listaStavki;
    private double ukupno;
    private LocalDateTime datum;

    public Racun() {
    }

    public Racun(int RacunId, Korisnik korisnik, List<StavkaRacuna> listaStavki) {
        this.RacunId = RacunId;
        this.korisnik = korisnik;
        this.listaStavki = listaStavki;
    }

    public List<StavkaRacuna> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(List<StavkaRacuna> listaStavki) {
    	if (listaStavki==null) throw new NullPointerException();
        this.listaStavki = listaStavki;
    }

    public int getRacunId() {
        return RacunId;
    }

    public void setRacunId(int racunId) {
    	if (racunId < 0) throw new IllegalArgumentException();
        this.RacunId = racunId;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
    	if (korisnik==null) throw new NullPointerException();
        this.korisnik = korisnik;
    }

    public double getUkupno() {
        return ukupno;
    }

    public void setUkupno(double ukupno) {
        this.ukupno = ukupno;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

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
