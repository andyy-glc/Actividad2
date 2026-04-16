package empresa;

import java.util.Comparator;

public class PrendaPorCosto implements Comparator<Prenda> {
    @Override
    public int compare(Prenda p1, Prenda p2) {
        return Double.compare(p1.getCostoProduccionPorPieza(),
                p2.getCostoProduccionPorPieza());
    }
}