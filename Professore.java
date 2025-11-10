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
public class Professore extends Persona {

    static String getMateria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String materia;

    public Professore(String nominativo, String materia, LocalDate dNscita) {
        super(nominativo, dNscita);
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Professore{\n" + super.toString() + "materia=" + materia + '}';
    }
    
    
    
    
    
    
}
