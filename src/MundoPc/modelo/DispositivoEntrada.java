package MundoPc.modelo;

public class DispositivoEntrada {
    private final String tipoEntrada;
    private final String marca;

    //Constructor
    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @java.lang.Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoEntrada='" + tipoEntrada + "'" +
                ", marca='" + marca + "'" +
                "}";
    }
}
