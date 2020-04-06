import java.lang.String;
import java.lang.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Telefony {

    public static void main(String[] args) {
        // Tworzenie dwóch obiektów typu Telefon
        Publikacja k1 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 387);
        Publikacja k2 = new Ksiazka("Bolek i Lolek", "Jan Kowalski", 13);
        Publikacja k3 = new Ksiazka(null, "Mariusz Leśnik", 13);
        Publikacja k4 = new Ksiazka("Dziady", "Adam Mickiewicz", 420);
        System.out.println("" + k1); //k1 ksiazka orginal
        Publikacja kk1 = new KsiazkaZOkladkaZwykla(k1);
        System.out.println("" + kk1); //k1 z okl zwyklą
        System.out.println("" + k2); //k2 ksiazka orginal
        Publikacja kk2 = new KsiazkaZOkladkaTwarda(k2);
        System.out.println("" + kk2); //k2 z okl twarda

        Publikacja kk3 = new KsiazkaZOkladkaTwarda(kk1); //proba dodania okladki do k1 gdzie jest juz okladka
        System.out.println("" + kk3);
        Publikacja kk4 = new KsiazkaZObwoluta(kk1); // k1 dodanie obwoluty
        System.out.println("" + kk4);
        Publikacja kk5 = new KsiazkaZObwoluta(k1); //proba dodania obwoluty do ksiazki ktora nie ma okladki
        System.out.println("" + kk5);
        Publikacja kk6 = new KsiazkaZObwoluta(kk4); ///proba dodania obwoluty do ksiazki ktora ma juz obwolute
        System.out.println("" + kk6);
        Publikacja kk8 = new KsiazkaZAutografem(k4, "Drogiej Hani - Adam Mickiewicz");
        System.out.println("" + kk8);

    }

}