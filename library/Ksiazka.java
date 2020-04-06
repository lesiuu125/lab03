public class Ksiazka implements Publikacja {

    String autor;
    String nazwa;
    int ilosc_stron;
    public Ksiazka(String nazwa, String autor,  int ilosc_stron)
    {
        this.autor = autor != null ? autor : "nieznany";
        this.nazwa = nazwa != null ? nazwa : "nieznany";
        this.ilosc_stron = ilosc_stron > 0 ? ilosc_stron : 0;
    }
    public String toString(){
        String result = ""+autor+" | "+nazwa+" | "+ilosc_stron;
        return result;
    }


}
