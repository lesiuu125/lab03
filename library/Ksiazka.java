public class Ksiazka implements Publikacja {

    // pola
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


    // metody
/*
    public void wyslijSMS(int nr, String tekst) {
        System.out.println("\n* Wysyłam SMS na nr: " + nr);
        System.out.println("* O treści: " + tekst);
    }

    public String odbierzSMS() {
        return "\n* SMS: Witaj telefonie!";
    }

    public void zadzwon(Telefon tel) {
        System.out.println("\n* Ja, telefon marki " + marka + " o numerze " + numer);
        System.out.println("* Dzwonię na nr: " + tel.numer);
        // Wywołanie metody na obiekcie tel
        tel.odbierzPolaczenie(numer);
    }

    public void odbierzPolaczenie(int nr) {
        System.out.println("\n# Ja, telefon marki "+ marka + " o numerze " + numer);
        System.out.println("# Odbieram połączenie od nr: " + nr);
    }
*/
}