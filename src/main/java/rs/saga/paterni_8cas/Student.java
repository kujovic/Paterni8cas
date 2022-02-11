package rs.saga.paterni_8cas;

import statusi.Status;
import statusi.StatusBudzet;
import statusi.StatusObnavljanje;
import statusi.StatusSamofinansirajuci;

/**
 *
 * @author stefan.kujovic
 */
public class Student {

    private int indeks;
    private int godinaUpisa;
    private String ime;
    private String prezime;
    private int espb;
    private int godinaStudija;
    private Status status;
    

    public Student() {
    }

    public Student(int indeks, int godinaUpisa, String ime, String prezime, int espb, int godinaStudija) {
        this.indeks = indeks;
        this.godinaUpisa = godinaUpisa;
        this.ime = ime;
        this.prezime = prezime;
        this.espb = espb;
        this.godinaStudija = godinaStudija;
        status = Status.vratiOdgovarajuciStatus(espb);
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void upisiNarednuGodinu() {
        status.upisiNarednuGodinu(this);
    }

    public void poloziIspit(int brojBodova) {
        status.poloziIspit(this, brojBodova);
    }

    public void prikaziTrenutniStatus() {
        status.prikaziTrenutniStatus();
    }

    
    
}
