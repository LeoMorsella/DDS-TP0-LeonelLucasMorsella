package TP0.Operacion.Excepciones;

public class OperacionInvalidaExcepcion extends RuntimeException {

        public OperacionInvalidaExcepcion (String mensajeDeError) {
            System.out.println(mensajeDeError);
        }

}
