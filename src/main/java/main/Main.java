package main;

import view.jFrameCalculadora;

/**
 * Inicia a calculadora.
 */
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            jFrameCalculadora calculadora = new jFrameCalculadora();
            calculadora.setLocationRelativeTo(null);
            calculadora.setVisible(true);
        });
    }
}
