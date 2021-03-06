package ro.mta.facc.selab;

public class Carte implements Comparable<Carte> {
    private String titlu;

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    private String autor;

    public int getAnPublicatie() {
        return anPublicatie;
    }

    private int anPublicatie;

    @Override
    public int compareTo(Carte o) {
        if (this.nrPagini < o.nrPagini)
            return -1;
        if (this.nrPagini > o.nrPagini)
            return 1;
        return 0;
    }



    private int nrPagini;

    public Carte(String titlu, String autor, int anPublicatie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + ", aparuta in anul " + this.anPublicatie;
    }
}
