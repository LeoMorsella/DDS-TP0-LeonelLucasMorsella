public class Item {
    private String nombre;
    private int precio;
    private TipoDeProducto tipo;

    public int getPrecio() {
        return precio;
    }

    public TipoDeProducto getTipo() {
        return tipo;
    }


    public void cambiarPrecio( int nuevoPrecio) {
                precio = nuevoPrecio;
    }

    public Item(String nombre,int precio, TipoDeProducto tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }
}
