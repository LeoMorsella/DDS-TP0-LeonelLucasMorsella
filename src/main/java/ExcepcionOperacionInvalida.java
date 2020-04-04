public class ExcepcionOperacionInvalida extends RuntimeException {

        public ExcepcionOperacionInvalida(String mensajeDeError) {
            System.out.println(mensajeDeError);
        }

}
