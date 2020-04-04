import java.util.ArrayList;
import java.util.List;

public class Operacion {
    public ArrayList<Item> items;
    public int valorOperacion;
    public TipoDocumento tipoDocumento;

    public Operacion(ArrayList<Item> items) {
        this.items = items;
    }

    public int getValorOperacion() {
        return valorOperacion;
    }
    public void agregarItem(Item item) {
        items.add(item);
    }

    public int calcularValorDeOperacion() {
        return valorOperacion = items.stream().mapToInt(i -> i.getPrecio()).sum();
    }
    public Documento generarDocumento(){
        Documento documento = new Documento(this.items,this.tipoDocumento,this.valorOperacion);
        return documento;
    }

    public void validarTipoDeDocumento() {
        if(items.stream().anyMatch(item -> item.getTipo().equals(TipoDeProducto.SERVICIO))) {
            this.tipoDocumento = tipoDocumento.DOCUMENTO;
        }
        else {
            this.tipoDocumento = tipoDocumento.REMITO;
        }
    }

    public Documento cerrarOperacion() {
        if(items.size() > 0) {
            calcularValorDeOperacion();
            validarTipoDeDocumento();
            return generarDocumento();
        }
        else {
            throw new ExcepcionOperacionInvalida("La operacion no tiene elementos");
        }
    }
}
