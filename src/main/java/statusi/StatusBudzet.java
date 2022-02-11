package statusi;

import rs.saga.paterni_8cas.Student;

/**
 *
 * @author stefan.kujovic
 */
public class StatusBudzet implements Status {

    @Override
    public void upisiNarednuGodinu(Student s) {
        s.setGodinaStudija(s.getGodinaStudija() + 1);
        System.out.println("Upisali ste " + s.getGodinaStudija() + ". godinu na teret budzeta.");
        s.setEspb(0);
       // s.setStatus(new StatusObnavljanje());
       s.setStatus(Status.vratiOdgovarajuciStatus(s.getEspb())); 
    }

    @Override
    public void poloziIspit(Student s, int brojBodova) {
        s.setEspb(s.getEspb()+brojBodova);
        System.out.println("Polozen ispit.Trenutni broj bodova je :" + s.getEspb());
    }

    @Override
    public void prikaziTrenutniStatus() {
        System.out.println("Upis godine na teret budzeta.");
    }

}
