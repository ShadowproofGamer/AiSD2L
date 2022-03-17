public class PracownikGodzinowy extends Pracownik{
    double stawka;
    int licz_godz;
    public PracownikGodzinowy(){
        super();
        stawka=0;
        licz_godz=0;
    }
    public PracownikGodzinowy(String nazwisko, String imie, long pesel, String stanowisko, int staz, int licz_godz, double stawka){
        super(nazwisko, imie, pesel, stanowisko, staz);
        this.licz_godz=licz_godz;
        this.stawka=stawka;
    }

    @Override
    public double pensja() {
        return stawka*licz_godz;
    }

    @Override
    public String toString() {
        return String.format("%-10s, %-10s, %-12d, %-10s, %-5d, %-7.2f", nazwisko, imie, pesel, stanowisko, staz, pensja());
    }
}
