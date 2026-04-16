package empresa;

import java.util.Comparator;

public class LotePorPiezas implements Comparator<Lote> {
    @Override
    public int compare(Lote l1, Lote l2) {
        return Integer.compare(l1.getNumeroPiezas(),
                l2.getNumeroPiezas());
    }
}