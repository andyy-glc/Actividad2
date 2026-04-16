package empresa;

import java.time.LocalDate;
import java.util.Objects;

public class Lote implements Comparable<Lote> {

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

    public double calcularPrecioVentaPorPieza(double costoPorPieza) {
        return costoPorPieza * 1.15;
    }

    public double calcularMontoRecuperacion(double costoPorPieza) {
        return numeroPiezas * (costoPorPieza * 1.05);
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }

    public void setNumeroPiezas(int numeroPiezas) {
        this.numeroPiezas = numeroPiezas;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    @Override
    public int compareTo(Lote otro) {
        return Integer.compare(this.numeroLote, otro.numeroLote);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lote)) return false;
        Lote otro = (Lote) o;
        return this.numeroLote == otro.numeroLote;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroLote);
    }

    @Override
    public String toString() {
        return "Lote #" + numeroLote +
                ", piezas=" + numeroPiezas +
                ", fecha=" + fechaFabricacion;
    }
}