import java.util.List;

public class Documento {
    private List<Item> items;
    private TipoDocumento tipo;
    private int importeTotal;

    public Documento(List<Item> items, TipoDocumento tipo, int importeTotal) {
        this.items = items;
        this.tipo = tipo;
        this.importeTotal = importeTotal;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }


}
