package main;

import javax.swing.JFrame;

public class Ventana extends JFrame implements Runnable {

    public Ventana(){
        setSize(Constantes.ALTO_PANTALLA, Constantes.ANCHO_PANTALLA);
        setTitle(Constantes.TITULO_PANTALLA);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void run() {
        System.out.println("El juego ha empezado");
    }


}
