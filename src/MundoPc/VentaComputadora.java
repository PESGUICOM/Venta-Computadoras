package MundoPc;

import MundoPc.modelo.Computadora;
import MundoPc.modelo.Monitor;
import MundoPc.modelo.Raton;
import MundoPc.modelo.Teclado;
import MundoPc.servicio.Orden;

public class VentaComputadora {
    public static void main(String[] args) {
         //Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        // System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        // System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        // System.out.println(monitorLenovo);

        //Creamos un objeto de tipo computadora
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadoraLenovo);
        System.out.println();

        //Objeto computadora
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        Monitor monitorMac = new Monitor("Mac", 17);
        Teclado tecladoMac = new Teclado("usb", "Mac");
        Raton ratonMac = new Raton("usb", "Mac");
        Computadora computadoraMac = new Computadora("Computadora Mac", monitorMac, tecladoMac, ratonMac);

        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.mostrarOrden();

        System.out.println();
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraDell);
        orden2.mostrarOrden();

        System.out.println();
        Orden orden3 = new Orden();
        orden3.agregarComputadora(computadoraMac);
        orden3.mostrarOrden();
    }
}
