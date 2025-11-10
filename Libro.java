package prjesercizio;

public class Libro {
    private String titolo;
    private int annoPubblicazione;
    private int nPag;

    public Libro(String titolo, int annoPubblicazione, int nPag) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.nPag = nPag;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getnPag() {
        return nPag;
    }

    public String leggiTesto(){
        return "ciao Stenico";
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", nPag=" + nPag +
                '}';
    }
}


