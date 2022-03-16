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

        Pracownik[] tab = wczytaj(new Pracownik[50], 0);
        wyswietl(tab);


    }
    public static Pracownik[] wczytaj(Pracownik[] tab, int start){
        boolean toContinue = true;
        Scanner scan = new Scanner(System.in);
        while(toContinue){

            System.out.println("Wpisz typ (0=etat, 1=godziny):");
            String typ = scan.next();
            System.out.println("Wpisz nazwisko:");
            String nazwisko = scan.next();
            System.out.println("Wpisz imie:");
            String imie = scan.next();
            System.out.println("Wpisz pesel:");
            String pesel = scan.next();
            System.out.println("Wpisz stanowisko:");
            String stanowisko = scan.next();
            System.out.println("Wpisz staż (lata):");
            int staz = scan.nextInt();
            System.out.println("Wpisz etat/liczbe godzin:");
            double etat = scan.nextDouble();
            System.out.println("Wpisz stawkę:");
            double stawka = scan.nextDouble();
            if (typ.equals("0")||typ.equals("etat")){
                tab[start] = new PracownikEtatowy(nazwisko,imie,Long.parseLong(pesel),stanowisko,staz,etat,stawka);
                start++;
            }else if (typ.equals("1")||typ.equals("godziny")){
                tab[start] = new PracownikGodzinowy(nazwisko,imie,Long.parseLong(pesel),stanowisko,staz, (int) etat,stawka);
                start++;
            }
            System.out.println("Czy chcesz kontynuować? (0=nie  1=tak):");
            if (scan.next().equals("0"))toContinue=false;

        }
        return tab;
    }
    public static void wyswietl(Pracownik[] tab){
        System.out.printf("%s, %s, %s, %s, %s, %s", "nazwisko", "imie", "pesel", "stanowisko", "staz", "pensja");
        for (Pracownik p :
                tab) {
            System.out.println(p);
        }
    }
}
