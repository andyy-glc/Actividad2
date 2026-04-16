package empresa;

import java.util.Comparator;

public class LotePorFecha implements Comparator<Lote> {
    @Override
    public int compare(Lote l1, Lote l2) {
        return l1.getFechaFabricacion().
                compareTo(l2.getFechaFabricacion());
    }
}
