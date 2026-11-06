public class ValidadorString {

    private String valor;

    private ValidadorString(String valor) {
        this.valor = valor;
    }

    public static ValidadorString from(String valor) {
        return new ValidadorString(valor);
    }

    public ValidadorString validarLongitud(
            int minimo,
            int maximo) {

        if (valor == null) {
            throw new ValidadorException(
                    "El valor no puede ser null"
            );
        }

        if (valor.length() < minimo) {
            throw new ValidadorException(
                    "El valor debe tener al menos "
                    + minimo + " caracteres"
            );
        }

        if (valor.length() > maximo) {
            throw new ValidadorException(
                    "El valor no puede superar los "
                    + maximo + " caracteres"
            );
        }

        return this;
    }
}