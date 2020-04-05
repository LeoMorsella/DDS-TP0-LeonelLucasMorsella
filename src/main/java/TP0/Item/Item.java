package TP0.Item;

import TP0.Item.Excepciones.ItemYaCompradoExcepcion;

public class Item {
    private String nombre;
    private int precio;
    private TipoDeProducto tipo;
    private boolean itemComprado = false;

    public int getPrecio() {
        return precio;
    }

    public TipoDeProducto getTipo() {
        return tipo;
    }

    public void cambiarEstado() {
        itemComprado = true;
    }


    public void cambiarPrecio( int nuevoPrecio) {
        if(itemComprado) {
            throw new ItemYaCompradoExcepcion("Este item pertenece a un articulo ya vendido, no es posible cambiar su precio");
        }
        else {
        precio = nuevoPrecio;
        }
    }

    public Item(String nombre,int precio, TipoDeProducto tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }
}
