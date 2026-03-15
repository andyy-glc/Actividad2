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

    public Prenda(String modelo, String tela, double costoProduccionPorPieza,
                  String genero, String temporada, int limiteLotes) {

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
            lotes[indice] = lote;
            indice++;
        } else {
            System.out.println("No se pueden agregar más lotes.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public void setCostoProduccionPorPieza(double costo) {
        this.costoProduccionPorPieza = costo;
    }

    public String getGenero() {
        return genero;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Prenda: " + modelo +
                ", tela=" + tela +
                ", genero=" + genero +
                ", temporada=" + temporada +
                ", costo por pieza=" + costoProduccionPorPieza;
    }
}