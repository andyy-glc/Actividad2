package empresa;

import java.time.LocalDate;

public class Lote {

    private int numeroLote;
    private int numeroPiezas;
    private LocalDate fechaFabricacion;

    public Lote(int numeroLote, int numeroPiezas, LocalDate fechaFabricacion) {
        this.numeroLote = numeroLote;
        this.numeroPiezas = numeroPiezas;
        this.fechaFabricacion = fechaFabricacion;
    }

    public double calcularCostoProduccionLote(double costoPorPieza) {
        return numeroPiezas * costoPorPieza;
    }

    public double calcularMontoRecuperacion(double costoPorPieza) {
        double costoTotal = numeroPiezas * costoPorPieza;
        return costoTotal * 1.3; // ejemplo: 30% de ganancia
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroPiezas(int numeroPiezas) {
        this.numeroPiezas = numeroPiezas;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    @Override
    public String toString() {
        return "Lote #" + numeroLote +
                ", piezas=" + numeroPiezas +
                ", fecha=" + fechaFabricacion;
    }
}