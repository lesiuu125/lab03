import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KsiazkaZObwoluta extends Dekorator {
    public KsiazkaZObwoluta(Publikacja ksiazka)
    {
        super(ksiazka);
    }
    public String toString() {
        Pattern compiledPattern = Pattern.compile("Okladka zwykla");
        Matcher matcher = compiledPattern.matcher(ksiazka.toString());
        Pattern compiledPattern2 = Pattern.compile("Okladka twarda");
        Matcher matcher2 = compiledPattern2.matcher(ksiazka.toString());
        Pattern compiledPattern3 = Pattern.compile("Dodatkowa obwoluta");
        Matcher matcher3 = compiledPattern3.matcher(ksiazka.toString());
        if(matcher3.find() == true)
            return "Obwoluta może być jedna!";
        else if (matcher.find() == true || matcher2.find() == true)
            return ksiazka.toString() + " | Dodatkowa obwoluta";
        else
            return "Nie można obłożyć obwolutą książki, która nie posiada okładki!";
    }
}
