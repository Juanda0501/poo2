import javax.swing.*;
public class Pantalla extends JFrame {
    public Pantalla() {
        setLayout(null);
        setSize(900, 720);
        setTitle("Menú");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200, 100);
        setVisible(true);
    }
}
