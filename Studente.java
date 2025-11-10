/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjesercizio;

import java.time.LocalDate;

/**
 *
 * @author daniel.gliniecki
 */
public class Studente extends Persona {
    private String scuolaMedia;

    public Studente(String scuolaMedia, String nominativo, LocalDate dNscita) {
        super(nominativo, dNscita);
        this.scuolaMedia = scuolaMedia;
    }
    
    @Override
    public String toString() {
        return "Studente{\n" + super.toString() +  "scuolaMedia=" + scuolaMedia + '}';
    }
    
    
    
    
}
