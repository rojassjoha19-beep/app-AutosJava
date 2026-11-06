public class ValidadorInt {

    private String valor;

    private ValidadorInt(String valor) {
        this.valor = valor;
    }

    public static ValidadorInt from(String valor) {
        return new ValidadorInt(valor);
    }

    public ValidadorInt validarFormato() {

        if (valor == null ) {
            throw new ValidadorException(
                    "El valor no puede estar vacío"
            );
        }

        try {
            Integer.parseInt(valor);
        } catch (NumberFormatException error) {
            throw new ValidadorException(
                    "El valor debe ser un número entero"
            );
        }

        return this;
    }

    public ValidadorInt validarRango(
            int minimo,
            int maximo) {

        validarFormato();

        int numero = Integer.parseInt(valor);

        if (numero < minimo || numero > maximo) {
            throw new ValidadorException(
                    "El número debe estar entre "
                    + minimo + " y " + maximo
            );
        }

        return this;
    }

    public int obtenerValor() {
        validarFormato();
        return Integer.parseInt(valor);
    }
}