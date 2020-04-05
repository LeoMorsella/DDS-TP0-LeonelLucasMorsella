package TP0.Item.Excepciones;

public class ItemYaCompradoExcepcion extends RuntimeException {

    public ItemYaCompradoExcepcion(String mensajeDeError) {
        System.out.println(mensajeDeError);
    }

}