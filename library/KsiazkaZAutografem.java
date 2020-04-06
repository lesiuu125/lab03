public class KsiazkaZAutografem extends Dekorator{
    public KsiazkaZAutografem(Publikacja ksiazka, String autograf)
    {
        super(ksiazka);
    }

    public String toString(){
        String autograf="Dla Hanii - Adam Mickiewicz";
        return ksiazka.toString() +" | "+autograf;
    }
}
