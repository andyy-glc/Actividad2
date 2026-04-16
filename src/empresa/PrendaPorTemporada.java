package empresa;

import java.util.Comparator;

public class PrendaPorTemporada implements Comparator<Prenda> {
    @Override
    public int compare(Prenda p1, Prenda p2) {
        return p1.getTemporada().compareTo(p2.getTemporada());
    }
}