package main;

public class juegoMain {
    public static void main(String[] args) {

        Ventana ventana = new Ventana();

        Thread hilo = new Thread(ventana);
        hilo.start();

    }
}