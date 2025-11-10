package prjesercizio;

import java.util.Arrays;

public class Biblioteca {
    private Libro[]Libro;
    private int DimL;
    public Biblioteca(int LibriMax) {
        Libro = new Libro[LibriMax];
        DimL = 0;
    }

    public Libro[] getLibro() {
        return Libro;
    }

    public Libro prendiPrestito(String t){
        return cercaLibro(t);
    }

    private Libro cercaLibro(String L) {
        int i = 0;
        while (i < DimL && !Libro[i].getTitolo().equals(L)) {
            i++;

        }
        return Libro[i];
    }

    public void AggiungiLibro(Libro l1){
        Libro[DimL] = l1;
        DimL++;

    }

    @Override
    public String toString() {
        String t = "";
        for(int j =0;j<Libro.length;j++){
            t = "\nLibro = " + Libro[j];
        }
        return t;
    }
}
