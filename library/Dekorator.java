abstract public class Dekorator implements Publikacja {
    protected Publikacja ksiazka;

    public Dekorator(Publikacja ksiazka) {
        this.ksiazka = ksiazka;
    }
}