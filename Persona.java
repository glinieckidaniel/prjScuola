/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjesercizio;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author daniel.gliniecki
 */
public class Persona {
    private String nominativo;
    private LocalDate dNscita;

    public Persona(String nominativo, LocalDate dNscita) {
        this.nominativo = nominativo;
        this.dNscita = dNscita;
    }
    
    public int eta(){
        LocalDate oggi = LocalDate.now();
        Period eta = Period.between(dNscita,oggi);
        return eta.getYears();
    }

    public String leggi(Libro l){
        return l.getTitolo() + " " + l.leggiTesto();
    }

    public String leggi(Biblioteca b,String titolo){
        return leggi(b.prendiPrestito(titolo));
    }



    
    @Override
    public String toString() {
        return "Persona{" + "nominativo=" + nominativo + ", dNscita=" + dNscita + '}';
    }
    
    
    
    
}
