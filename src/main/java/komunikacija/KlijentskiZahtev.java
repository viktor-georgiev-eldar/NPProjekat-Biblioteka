/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import domenskiObjekti.Korisnik;
import java.io.Serializable;

/**
 *	Objekat koji se koristi za komunikaciu klijenta ka serveru
 *
 * @author Viktor
 */
public class KlijentskiZahtev implements Serializable{
    /**
     * id operacije
     */
    private int operacija;
    /**
     * Objekat koji se prosledjuje
     */
    private Object argument;
    /**
     * Informacije o posiljaocu
     */
    private Korisnik posiljalac;

    /**
     * Neparametrizovani konstruktor
     */
    public KlijentskiZahtev() {
    }

    /**
     * Parametrizovani konstruktor
     * 
     * @param operacija id operacije
     * @param argument objekat koji se prosledjuje
     * @param posiljalac informacije o posiljaocu
     */
    public KlijentskiZahtev(int operacija, Object argument, Korisnik posiljalac) {
        this.operacija = operacija;
        this.argument = argument;
        this.posiljalac = posiljalac;
    }

    
    /**
     * Vraca vrednost operacije.
     *
     * @return Vrednost operacije.
     */
    public int getOperacija() {
        return operacija;
    }

    /**
     * Postavlja vrednost operacije.
     *
     * @param operacija Vrednost operacije koja će biti postavljena.
     */
    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    /**
     * Vraca argument koji je povezan sa operacijom.
     *
     * @return Objekat argumenta.
     */
    public Object getArgument() {
        return argument;
    }

    /**
     * Postavlja argument koji je povezan sa operacijom.
     *
     * @param argument Objekat argumenta koji će biti postavljen.
     */
    public void setArgument(Object argument) {
        this.argument = argument;
    }

    /**
     * Vraca pošiljaoca operacije.
     *
     * @return Pošiljalac (Korisnik objekat).
     */
    public Korisnik getPosiljalac() {
        return posiljalac;
    }

    /**
     * Postavlja pošiljaoca operacije.
     *
     * @param posiljalac Pošiljalac (Korisnik objekat) koji će biti postavljen.
     */
    public void setPosiljalac(Korisnik posiljalac) {
        this.posiljalac = posiljalac;
    }
    
}
