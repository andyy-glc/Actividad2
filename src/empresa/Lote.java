package empresa;

import java.time.LocalDate;

public class Lote {

    private int numeroLote;
    private int numeroPiezas;
    private LocalDate fechaFabricacion;
    private Prenda prenda;
    private double costoProduccionLote;
    private double montoRecuperacion;

    public Lote(int numeroLote,
                int numeroPiezas,
                LocalDate fechaFabricacion,
                Prenda prenda) {

        this.numeroLote = numeroLote;
        this.numeroPiezas = numeroPiezas;
        this.fechaFabricacion = fechaFabricacion;
        this.prenda = prenda;

        this.costoProduccionLote = calcularCostoProduccionLote();
        this.montoRecuperacion = calcularMontoRecuperacion();
    }

    public double calcularCostoProduccionLote() {
        return numeroPiezas * prenda.getCostoProduccionPorPieza();
    }

    public double calcularMontoRecuperacion() {
        double precioVentaPorPieza = prenda.getCostoProduccionPorPieza() * 1.05;
        return numeroPiezas * precioVentaPorPieza;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "numeroLote=" + numeroLote +
                ", numeroPiezas=" + numeroPiezas +
                ", fechaFabricacion=" + fechaFabricacion +
                ", costoProduccionLote=" + costoProduccionLote +
                ", montoRecuperacion=" + montoRecuperacion +
                '}';
    }
}