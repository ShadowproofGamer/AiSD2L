import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Obszar testowy:
        //ArrayList<Pracownik> pracownicy = new ArrayList<>();
        //pracownicy.add(new PracownikEtatowy("Mżonka", "Małgorzata", Long.parseLong("02247856712"), "Księgowa", 3, 0.5, 4000));
        //pracownicy.add(new PracownikEtatowy("Mżonka", "Kacper", Long.parseLong("02144562387"), "Kierowca", 5, 1, 3800));
        //pracownicy.add(new PracownikEtatowy("Rybka", "Adam", Long.parseLong("79121418655"), "Szef działu zaopatrzenia", 20, 1, 11000));
        //pracownicy.add(new PracownikGodzinowy("Burak", "Karol", Long.parseLong("02041412812"), "Budowniczy", 1, 30, 3200));
        //pracownicy.add(new PracownikGodzinowy("Fortuna", "Grzegorz", Long.parseLong("70012502022"), "Malarz", 4, 25, 4300));
//
        //Pracownik[] tab = new Pracownik[pracownicy.size()*8-7];
//
        //for (int i = 0; i < tab.length; i+=8) {
        //    Pracownik temp = pracownicy.get(i/8);
        //    tab[i] = temp.nazwisko;
        //
        //}

        Pracownik[] tab = new Pracownik[5];


    }
    public void wczytaj(Pracownik[] tab, int start){
        boolean toContinue = true;
        Scanner scan = new Scanner(System.in);
        while(toContinue){
            System.out.println("Wpisz nazwisko:");
            String nazwisko = scan.next();
            System.out.println("Wpisz imie:");
            String imie = scan.next();
            System.out.println("Wpisz pesel:");
            String pesel = scan.next();
            System.out.println("Wpisz stanowisko");
            String stanowisko = scan.next();
            System.out.println("Wpisz staż (lata):");
            int staz = scan.nextInt();
            System.out.println("Wpisz etat");
            double etat = scan.nextDouble();
            System.out.println("Wpisz stawkę:");
            double stawka = scan.nextDouble();

        }

    }
}
