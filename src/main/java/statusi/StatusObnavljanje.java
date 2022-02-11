package statusi;

import rs.saga.paterni_8cas.Student;
import statusi.Status;

/**
 *
 * @author stefan.kujovic
 */
public class StatusObnavljanje implements Status {

    @Override
    public void upisiNarednuGodinu(Student s) {
        System.out.println("Nemate dovoljno bodova za upis naredne godine.");
    }

    @Override
    public void poloziIspit(Student s,int brojBodova) {
        s.setEspb(s.getEspb()+brojBodova);
        System.out.println("Polozen ispit.Trenutni broj bodova je :" + s.getEspb());
        
        /*if(s.getEspb()>37){
            s.setStatus(new StatusSamofinansirajuci());
        }*/
        s.setStatus(Status.vratiOdgovarajuciStatus(s.getEspb()));
    }

    @Override
    public void prikaziTrenutniStatus() {
        System.out.println("Obnavljanje godine.");
    }

}
