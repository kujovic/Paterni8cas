/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statusi;

import rs.saga.paterni_8cas.Student;

/**
 *
 * @author stefan.kujovic
 */
public class StatusSamofinansirajuci implements Status {

    @Override
    public void upisiNarednuGodinu(Student s) {
        s.setGodinaStudija(s.getGodinaStudija()+1);
        System.out.println("Upisali ste " + s.getGodinaStudija() + ". godinu kao samofinansirajuci student.Uplatite skolarinu.");
        s.setEspb(0);
        //s.setStatus(new StatusObnavljanje());
        s.setStatus(Status.vratiOdgovarajuciStatus(s.getEspb()));
        
    }

    @Override
    public void poloziIspit(Student s, int brojBodova) {
        s.setEspb(s.getEspb()+brojBodova);
        System.out.println("Polozen ispit.Trenutni broj bodova je :" + s.getEspb());
        
       /* if(s.getEspb() > 47){
            s.setStatus(new StatusBudzet());
        }*/
       s.setStatus(Status.vratiOdgovarajuciStatus(s.getEspb()));
    }

    @Override
    public void prikaziTrenutniStatus() {
        System.out.println("Upis godine na status samofinansiranja");
    }

}
