package empresa;

public class Prenda {

    private String modelo;
    private String tela;
    private double costoProduccionPorPieza;
    private String genero;
    private String temporada;
    private Lote[] lotes;
    private int indice;
    private int limiteLotes;

    public Prenda(String modelo,
                  String tela,
                  double costoProduccionPorPieza,
                  String genero,
                  String temporada,
                  int limiteLotes) {

        this.modelo = modelo;
        this.tela = tela;
        this.costoProduccionPorPieza = costoProduccionPorPieza;
        this.genero = genero;
        this.temporada = temporada;
        this.limiteLotes = limiteLotes;
        this.lotes = new Lote[limiteLotes];
        this.indice = 0;
    }

    public void agregarLote(Lote lote) {
        if (indice < limiteLotes) {
            this.lotes[indice] = lote;
            indice++;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public double getCostoProduccionPorPieza() {
        return costoProduccionPorPieza;
    }



    @Override
    public String toString() {
        return "Prenda{" +
                "modelo='" + modelo + '\'' +
                ", tela='" + tela + '\'' +
                ", costoProduccionPorPieza=" + costoProduccionPorPieza +
                ", genero='" + genero + '\'' +
                ", temporada='" + temporada + '\'' +
                ", cantidadLotes=" + indice +
                '}';
    }
}