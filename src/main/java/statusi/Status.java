/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package statusi;

import rs.saga.paterni_8cas.Student;

//Promena statusa, da prelazi iz jednog u drugi...---State patern
//Factory patern, staticka metoda...kada logiku kreiranja izmestamo logiku (ni abstract ni method)

public interface Status {

    public void upisiNarednuGodinu(Student s);

    public void poloziIspit(Student s,int brojBodova);

    public void prikaziTrenutniStatus();
    
    public static Status vratiOdgovarajuciStatus(int espb){
        Status status;
        
        if(espb<37){
            status = new StatusObnavljanje();
        } else if(espb <47){
            status = new StatusSamofinansirajuci();
        }
        else {
            status = new StatusBudzet();
        }
        return status;
    }
}
