public class PracownikEtatowy extends Pracownik{
    double etat;
    double stawka;
    public PracownikEtatowy(){
        super();
        etat=1;
        stawka=0;
    }
    public PracownikEtatowy(String nazwisko, String imie, long pesel, String stanowisko, int staz, double etat, double stawka){
        super(nazwisko, imie, pesel, stanowisko, staz);
        this.etat=etat;
        this.stawka=stawka;
    }

    @Override
    public double pensja() {
        return stawka*etat;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %s, %d, %f", nazwisko, imie, pesel, stanowisko, staz, pensja());
    }
}
