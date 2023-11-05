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
public class TestObjekat implements Serializable{
    private int espb;
    private String komentar;

    public TestObjekat(int espb, String komentar) {
        this.espb = espb;
        this.komentar = komentar;
    }

    public TestObjekat() {
    }

    public int getEspb() {
        return espb;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }
    
    
}
