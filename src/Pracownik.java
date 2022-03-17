import java.io.Serializable;

public abstract class Pracownik implements Serializable {
    protected String nazwisko;
    protected String imie;
    protected long pesel;
    protected String stanowisko;
    protected int staz;
    public Pracownik(){
        this.nazwisko ="nazwisko";
        this.imie="imie";
        this.pesel=00000000000;
        this.stanowisko="stanowisko";
        this.staz=0;
    }
    public Pracownik(String nazwisko, String imie, long pesel, String stanowisko, int staz){
        this.nazwisko =nazwisko;
        this.imie=imie;
        this.pesel=pesel;
        this.stanowisko=stanowisko;
        this.staz=staz;
    }
    public void wyswietl(){
        System.out.printf("%s %s %d %s %d", nazwisko, imie, pesel, stanowisko, staz);
    }
    public String toString(){
        return String.format("%s, %s, %d, %s, %d, %f", nazwisko, imie, pesel, stanowisko, staz, pensja());
    }
    public double pensja(){
        return 0;
    }
}
