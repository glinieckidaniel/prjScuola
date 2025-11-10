/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjesercizio;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
/**
 *
 * @author daniel.gliniecki
 */
public class PrjEsercizio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate dn = LocalDate.of(2000, 01, 01);
        Persona p1 = new Persona("Rossi",dn);
        System.out.println(p1.toString());
        dn = LocalDate.of(2000, 01, 02);
        Professore pf1 = new Professore("Bianchi","Filosofia",dn);
        System.out.println(pf1.toString());
        Studente st1 = new Studente("Manzoni","Neri",dn);
        System.out.println(st1.toString());
        
        
        System.out.println("\n\n --- CLASSE OUTPUT ---");
        Classe c1 = new Classe(10,"R40");
        c1.addPersona(st1);
        c1.addPersona(pf1);
        c1.addPersona(p1);
        System.out.println(c1.toString());
        
    }
    
    
}
