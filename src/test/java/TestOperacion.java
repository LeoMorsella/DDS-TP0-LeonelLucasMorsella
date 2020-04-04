import TP0.Documento.Documento;
import TP0.Documento.TipoDocumento;
import TP0.Item.Item;
import TP0.Item.TipoDeProducto;
import TP0.Operacion.Excepciones.ExcepcionOperacionInvalida;
import TP0.Operacion.Operacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class TestOperacion {


    Item impresora = new Item("impresora",7000, TipoDeProducto.PRODUCTO);
    Item placaDeVideo = new Item("Placa De Video",25000,TipoDeProducto.PRODUCTO);
    Item armadoDePC = new Item("Armado De PC",5000,TipoDeProducto.SERVICIO);



    @Test
    public void testCambiarPrecio() {
        impresora.cambiarPrecio(10000);
        assertEquals(10000,impresora.getPrecio());
    }

    @Test
    public void testCalcularValorDeOperacion() {
        ArrayList<Item> items = new ArrayList<Item>();
        Operacion operacion = new Operacion(items);
        items.add(impresora);
        items.add(placaDeVideo);
        items.add(armadoDePC);
        operacion.calcularValorDeOperacion();
        assertEquals(37000,operacion.getValorOperacion());

    }

    @Test
    public void testCerrarOperacionDocumento() {
        ArrayList<Item> items = new ArrayList<Item>();
        Operacion operacion = new Operacion(items);
        items.add(impresora);
        items.add(placaDeVideo);
        items.add(armadoDePC);
        Documento documento = operacion.cerrarOperacion();
        assertEquals(TipoDocumento.DOCUMENTO,documento.getTipo());
    }

    @Test
    public void testCerrarOperacionRemito() {
        ArrayList<Item> items = new ArrayList<Item>();
        Operacion operacion = new Operacion(items);
        items.add(impresora);
        items.add(placaDeVideo);
        Documento documento = operacion.cerrarOperacion();
        assertEquals(TipoDocumento.REMITO,documento.getTipo());

    }

    @Test
    public void testOperacionVacia() {
        ArrayList<Item> items = new ArrayList<Item>();
        Operacion operacion = new Operacion(items);
        Assertions.assertThrows(ExcepcionOperacionInvalida.class,() -> operacion.cerrarOperacion());
    }


}
