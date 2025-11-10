/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjesercizio;

/**
 *
 * @author daniel.gliniecki
 */
public class Classe {
    private Persona[] c;
    private String nAula;
    private int nElem;

    public Classe(int nElem,String nAula) {
       c = new Persona[nElem];
       this.nAula = nAula;
    }

    public void addPersona(Persona p){
        c[nElem] = p;
        nElem++;
    }
    
    public String getMateria(int i){
        String txt = " ";
        if(c[i] instanceof Professore ){
            txt = Professore.getMateria();
        }  
        return txt;
    }
    
    @Override
    public String toString() {
        String txt = "Classe{";
        for(int i=0;i<nElem;i++){
            txt += "\nc[" + i + "]" + c[i].toString();
        }
        txt += "\nnAula=" + nAula + ", nElem=" + nElem + '}';
        return txt;
    }

    
   
    
    }

    
    
    
    
    

