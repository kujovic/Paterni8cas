package rs.saga.paterni_8cas;

/*
Kreacioni patern -  
*/


public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student(1, 2020, "Pera", "Peric", 30, 1);
        
        student1.prikaziTrenutniStatus();
        student1.upisiNarednuGodinu();
        student1.poloziIspit(6);
        System.out.println("-------------------------------------------------------------------");
        student1.upisiNarednuGodinu();
        student1.poloziIspit(6);
        System.out.println("-------------------------------------------------------------------");
        student1.prikaziTrenutniStatus();
        student1.upisiNarednuGodinu();
        student1.prikaziTrenutniStatus();
        
        student1.poloziIspit(6);
        student1.poloziIspit(6);
        student1.poloziIspit(6);
        student1.poloziIspit(6);
        student1.poloziIspit(6);
        student1.poloziIspit(6);
        student1.poloziIspit(6);
        student1.poloziIspit(6);
        
        student1.prikaziTrenutniStatus();
        student1.upisiNarednuGodinu();
        
    }
}
