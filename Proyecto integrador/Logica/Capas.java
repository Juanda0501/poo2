package Logica;

import Igu.Pantalla;

import javax.swing.*;


public class Capas extends Pantalla{

    public static void main(String[] args) {

        Pantalla panta = new Pantalla();
        panta.setContentPane(new Pantalla().getPanel1());
        panta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panta.setLocationRelativeTo(null);
        panta.setVisible(true);
        panta.pack();

    }
}
