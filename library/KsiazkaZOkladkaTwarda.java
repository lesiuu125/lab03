import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KsiazkaZOkladkaTwarda extends Dekorator {
    public KsiazkaZOkladkaTwarda(Publikacja ksiazka)
    {
        super(ksiazka);
    }
    public String toString(){
        Pattern compiledPattern = Pattern.compile("Okladka zwykla");
        Matcher matcher = compiledPattern.matcher(ksiazka.toString());
        Pattern compiledPattern2 = Pattern.compile("Okladka twarda");
        Matcher matcher2 = compiledPattern2.matcher(ksiazka.toString());

        if(matcher.find() == true || matcher2.find()==true)
            return "Ksiazka juz ma okladke";
        else
            return ksiazka.toString() + " | Okladka twarda";

    }

}
