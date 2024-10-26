package MundoPc.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private int tamano;
    private static int contadorMonitores;

    private Monitor(){
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, int tamano){
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + "'" +
                ", tamano=" + tamano +
                "}";
    }
}
