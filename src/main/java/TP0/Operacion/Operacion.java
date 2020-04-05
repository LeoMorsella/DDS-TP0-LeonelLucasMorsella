package TP0.Operacion;

import TP0.Documento.TipoDocumento;
import TP0.Item.Item;
import TP0.Item.TipoDeProducto;
import TP0.Documento.*;
import TP0.Operacion.Excepciones.OperacionInvalidaExcepcion;


import java.util.ArrayList;

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
        documento.getItems().stream().forEach(item -> item.cambiarEstado());
        return documento;
    }

    public void validarTipoDeDocumento() {
        if(items.stream().anyMatch(item -> item.getTipo().equals(TipoDeProducto.SERVICIO))) {
            this.tipoDocumento = tipoDocumento.NOTADEVENTA;
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
            throw new OperacionInvalidaExcepcion("La operacion no tiene elementos");
        }
    }
}
