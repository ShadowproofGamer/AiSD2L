import java.util.Iterator;

public class Iterator1 implements Iterator {
    private Pracownik[] tab;
    int pos = 0;
    public Iterator1(Pracownik[] tab){
        this.tab=tab;
    }
    @Override
    public boolean hasNext() {
        return pos<tab.length&&tab[pos]!=null;
    }

    @Override
    public Pracownik next() {
        pos++;
        return tab[pos-1];
    }
}
