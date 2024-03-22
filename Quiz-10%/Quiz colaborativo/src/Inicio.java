import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Inicio extends JFrame implements ActionListener {
    Pantalla pantalla;
    static Inquilino inquilino = new Inquilino();
    static Propietario propietario = new Propietario();
    static JButton opcion1,opcion2,opcion3,opcion4,opcion5,opcion6,opcion7,opcion8,opcion9,opcion10,salir;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(opcion1)){
            pantalla.dispose();
            inquilino.RegistrarInquilino();
        } else if (e.getSource().equals(opcion3)) {
            ///Listar inquilinos
            pantalla.dispose();
            inquilino.listarInquilino();
        } else if (e.getSource().equals(opcion5)) {
            ///Buscar inqilinos
            pantalla.dispose();
            inquilino.buscarInquilino();
        } else if (e.getSource().equals(opcion7)) {
            ///Actualizar inquilinos
            pantalla.dispose();
            inquilino.actualizaInquilino();
        } else if (e.getSource().equals(opcion9)) {
            ///Eliminar inquilinos
            pantalla.dispose();
            inquilino.eliminarInquilino();
        } else if (e.getSource().equals(opcion2)) {
            ///Registrar propietario
            pantalla.dispose();
            propietario.RegistrarPropietario();
        } else if (e.getSource().equals(opcion4)) {
            ///Listar propietario
            pantalla.dispose();
            propietario.listarPropietario();
        }else if (e.getSource().equals(opcion6)) {
            ///Buscar propietario
            pantalla.dispose();
            propietario.listarPropietario();
        }else if (e.getSource().equals(opcion8)) {
            ///Actualizar propietario
            pantalla.dispose();
            propietario.actualizaPropietario();
        }else if (e.getSource().equals(opcion10)) {
            ///Eliminar propietario
            pantalla.dispose();
            propietario.eliminarPropietario();
        } else if (e.getSource().equals(salir)) {
            pantalla.dispose();
        }
    }

    public Inicio(){
        ///opcion 1 settings
        opcion1 = new JButton("Registrar Inquilino");
        opcion1.setBounds(120,10,210,35);
        opcion1.addActionListener(this);
        ///opcion 2 settings
        opcion2 = new JButton("Registrar propietario");
        opcion2.setBounds(120,80,210,35);
        opcion2.addActionListener(this);
        ///opcion 3 settings
        opcion3 = new JButton("Listar Inquilino");
        opcion3.setBounds(120,150,210,35);
        opcion3.addActionListener(this);
        ///opcion 4 settings
        opcion4 = new JButton("Listar propietario");
        opcion4.setBounds(120,220,210,35);
        opcion4.addActionListener(this);
        ///opcion 5 settings
        opcion5 = new JButton("Buscar Inquilino");
        opcion5.setBounds(120,290,210,35);
        opcion5.addActionListener(this);
        ///opcion 6 settings
        opcion6 = new JButton("Buscar propietario");
        opcion6.setBounds(120,360,210,35);
        opcion6.addActionListener(this);
        ///opcion 7 settings
        opcion7 = new JButton("Actualizar Inquilino");
        opcion7.setBounds(120,430,210,35);
        opcion7.addActionListener(this);
        ///opcion 8 settings
        opcion8 =new JButton("Actualizar propietario");
        opcion8.setBounds(120,500,210,35);
        opcion8.addActionListener(this);
        ///opcion 9 settings
        opcion9 = new JButton("Eliminar Inquilino");
        opcion9.setBounds(120,570,210,35);
        opcion9.addActionListener(this);
        ///opcion 10 settings
        opcion10 = new JButton("Eliminar propietario");
        opcion10.setBounds(120,640,210,35);
        opcion10.addActionListener(this);
        ///logo UNAC
        JLabel etiquetaImagen = new JLabel(new ImageIcon("src/Imagenes/Captura de pantalla 2024-03-02 204650.png"));
        etiquetaImagen.setBounds(365,-70,500,600);
        ///opcion seleccion
        salir = new JButton("SALIR");
        salir.setBounds(430,450,370,40);
        salir.addActionListener(this);
        ///inicializar pantalla
        pantalla = new Pantalla();
        pantalla.add(opcion1);
        pantalla.add(opcion2);
        pantalla.add(opcion3);
        pantalla.add(opcion4);
        pantalla.add(opcion5);
        pantalla.add(opcion6);
        pantalla.add(opcion7);
        pantalla.add(opcion8);
        pantalla.add(opcion9);
        pantalla.add(opcion10);
        pantalla.add(etiquetaImagen);
        pantalla.add(salir);
    }

    public static void main(String[] args) {
        Inicio inicio = new Inicio();
    }

}