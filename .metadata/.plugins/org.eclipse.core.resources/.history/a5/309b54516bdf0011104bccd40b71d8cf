public class ValidadorDouble {

    private String valor;

    private ValidadorDouble(String valor) {
        this.valor = valor;
    }

    public static ValidadorDouble from(String valor) {
        return new ValidadorDouble(valor);
    }

    public ValidadorDouble validarFormato() {

        if (valor == null ) {
            throw new ValidadorException(
                    "El valor no puede estar vacío"
            );
        }

        try {
            Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            throw new ValidadorException(
                    "El valor debe ser un número decimal"
            );
        }

        return this;
    }

    public ValidadorDouble validarRango(
            double minimo,
            double maximo) {

        validarFormato();

        double numero = Double.parseDouble(valor);

        if (numero < minimo || numero > maximo) {
            throw new ValidadorException(
                    "El número debe estar entre "
                    + minimo + " y " + maximo
            );
        }

        return this;
    }

    public double obtenerValor() {
        validarFormato();
        return Double.parseDouble(valor);
    }
}