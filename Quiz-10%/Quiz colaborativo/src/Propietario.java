import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class Propietario extends Persona implements ActionListener {
    static int documento;
    static String nombre;
    static String apellido;
    static int edad;
    static long id_propietario;
    static JLabel label1,label2,label3,label4,label5,labelBuscar,label9,verificacion_eliminar;
    static JTextArea areaTextoListar,areaTextobuscar;
    Pantalla Registro_Propietario,Listar_Propietario,buscar_Propietario,eliminar_Propietario;
    static JTextField opcionA,opcionB,opcionC,opcionD,opcionE,opcionDelte;
    static JButton ingresar,salir,salirListar,Registrar,salirbuscar,buscarInquilinoBoton,salirEliminar,borrar;
    static List<Propietario> propietarios = new ArrayList<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Registrar)){
            documento = Integer.parseInt(opcionA.getText());
            nombre = opcionB.getText();
            apellido = opcionC.getText();
            edad = Integer.parseInt(opcionD.getText());
            id_propietario = Integer.parseInt(opcionE.getText());
            propietarios.add(new Propietario(documento,nombre,apellido,edad,id_propietario));
        }else if (e.getSource().equals(salir)) {
            Registro_Propietario.dispose();
            Inicio inicio = new Inicio();
        } else if (e.getSource().equals(salirListar)) {
            Listar_Propietario.dispose();
            Inicio inicio = new Inicio();
        } else if (e.getSource().equals(buscar_Propietario)) {
            buscar_Propietario.dispose();
            Inicio inicio = new Inicio();
        } else if (e.getSource().equals(salirEliminar)) {
            eliminar_Propietario.dispose();
            Inicio inicio = new Inicio();
        }
    }
    public Propietario(int documento, String nombre, String apellido, int edad, long id_propietario) {
    }
    public Propietario() {
    }
    public static long getId_propietario() {
        return id_propietario;
    }
    public static void setId_propietario(long id_propietario) {
        Propietario.id_propietario = id_propietario;
    }
    public Propietario(int documento, String nombre, String apellido, int edad) {
        super(documento, nombre, apellido, edad);
    }
    public static int getDocumento() {
        return documento;
    }
    public static void setDocumento(int documento) {
        Propietario.documento = documento;
    }
    public static String getNombre() {
        return nombre;
    }
    public static void setNombre(String nombre) {
        Propietario.nombre = nombre;
    }
    public static String getApellido() {
        return apellido;
    }
    public static void setApellido(String apellido) {
        Propietario.apellido = apellido;
    }
    public static int getEdad() {
        return edad;
    }
    public static void setEdad(int edad) {
        Propietario.edad = edad;
    }
    public  void RegistrarPropietario(){
        ///Diseño de pantalla REGISTRAR INQUILINO
        label1 = new JLabel("LONG__ID Propietario");
        label1.setBounds(120,30,120,30);
        opcionA = new JTextField();
        opcionA.setBounds(120,55,210,35);
        ///opcion B
        label2 = new JLabel("INT__Documento");
        label2.setBounds(120,110,120,30);
        opcionB = new JTextField();
        opcionB.setBounds(120,135,210,35);
        ///opcion C
        label3 = new JLabel("STR__Nombre");
        label3.setBounds(120,190,120,30);
        opcionC = new JTextField();
        opcionC.setBounds(120,215,210,35);
        ///opcion D
        label4 = new JLabel("STR__Apellido");
        label4.setBounds(120,270,120,30);
        opcionD = new JTextField();
        opcionD.setBounds(120,295,210,35);
        ///opcion E
        label5 = new JLabel("INT__Edad");
        label5.setBounds(120,350,120,30);
        opcionE = new JTextField();
        opcionE.setBounds(120,375,210,35);
        ///logo UNAC
        JLabel etiquetaImagen = new JLabel(new ImageIcon("src/Imagenes/Captura de pantalla 2024-03-02 204650.png"));
        etiquetaImagen.setBounds(365,-70,500,600);
        ///INGRESAR
        ingresar = new JButton("Registrar");
        ingresar.setBounds(120,455,210,40);
        ingresar.addActionListener(this);
        ///Salir
        salir = new JButton("ATRAS");
        salir.setBounds(430,450,370,40);
        salir.addActionListener(this);
        ///pantalla nueva cuando se selecciona
        Registro_Propietario = new Pantalla();
        Registro_Propietario.setTitle("Registrar Propietario");
        Registro_Propietario.setVisible(true);
        ///Agregar Elementos
        Registro_Propietario.add(opcionA);
        Registro_Propietario.add(opcionB);
        Registro_Propietario.add(opcionC);
        Registro_Propietario.add(opcionD);
        Registro_Propietario.add(opcionE);
        Registro_Propietario.add(etiquetaImagen);
        Registro_Propietario.add(ingresar);
        Registro_Propietario.add(salir);
        Registro_Propietario.add(label1);
        Registro_Propietario.add(label2);
        Registro_Propietario.add(label3);
        Registro_Propietario.add(label4);
        Registro_Propietario.add(label5);
    }

    public  void listarPropietario(){
        areaTextoListar = new  JTextArea();
        areaTextoListar.setBounds(30,30,550,450);
        areaTextoListar.setEditable(false);
        Listar_Propietario = new Pantalla();
        Listar_Propietario.setSize(1100, 550);
        ///logo UNAC
        JLabel etiquetaImagen = new JLabel(new ImageIcon("src/Imagenes/Captura de pantalla 2024-03-02 204650.png"));
        etiquetaImagen.setBounds(600,-84,500,590);
        ///Scroll
        JScrollPane scroll = new JScrollPane(areaTextoListar);
        scroll.setBounds(30,30,550,450);
        ///Salir
        salirListar = new JButton("ATRAS");
        salirListar.setBounds(665,420,370,40);
        salirListar.addActionListener(this);
        ///Listar Propietarios
        String texto = "";
        for (int i = 0; i < propietarios.size(); i++) {
            String obj =
                    "Inquilino{" +"id_inquilino: " + propietarios.get(i).getId_propietario() +
                            " documento: " + propietarios.get(i).getDocumento() +
                            ", nombre: " + propietarios.get(i).getNombre() +
                            ", apellido: " + propietarios.get(i).getApellido() +
                            ", edad: " + propietarios.get(i).getEdad() +
                            "}\n";
            texto += obj;
            System.out.println(obj);
        }
        areaTextoListar.setText(texto);
        ///Agregar Elementos
        Listar_Propietario.add(etiquetaImagen);
        Listar_Propietario.add(salirListar);
        Listar_Propietario.add(scroll);
    }

    public  void buscarPropietario(){
        // ID a buscar
        labelBuscar = new JLabel("Id del Propietario a buscar");
        labelBuscar.setBounds(30,40,230,30);
        // Punto de digitación ID
        opcionA = new JTextField();
        opcionA.setBounds(30,75,250,30);
        // Area de texto
        areaTextobuscar = new  JTextArea();
        areaTextobuscar.setBounds(30,120,600,400);
        areaTextobuscar.setEditable(false);
        // Buscar Inquilino
        buscar_Propietario = new Pantalla();
        buscar_Propietario.setSize(1100, 650);
        ///Imagen del logo UNAC
        JLabel etiquetaImagen = new JLabel(new ImageIcon("src\\Imagenes\\Captura de pantalla 2024-03-02 204650.png"));
        etiquetaImagen.setBounds(600,-0,500,600);
        ///Salir
        salirbuscar = new JButton("ATRAS");
        salirbuscar.setBounds(665,500,370,40);
        salirbuscar.addActionListener(this);
        ///boton
        buscarInquilinoBoton = new JButton("✔");
        buscarInquilinoBoton.setBounds(280,75,45,30);
        buscarInquilinoBoton.addActionListener(this);
        ///Agregar Elementos
        buscar_Propietario.add(etiquetaImagen);
        buscar_Propietario.add(salirbuscar);
        buscar_Propietario.add(labelBuscar);
        buscar_Propietario.add(opcionA);
        buscar_Propietario.add(areaTextobuscar);
        buscar_Propietario.add(buscarInquilinoBoton);
    }
    public  void actualizaPropietario(){
    }
    public  void eliminarPropietario() {
        eliminar_Propietario = new Pantalla();
        eliminar_Propietario.setSize(800, 550);
        eliminar_Propietario.setVisible(true);
        eliminar_Propietario.setLocation(330, 150);
        eliminar_Propietario.setTitle("Eliminar Propietario");
        label9 = new JLabel("ingrese el ID");
        label9.setBounds(30, 198, 210, 30);
        opcionDelte = new JTextField();
        opcionDelte.setBounds(30, 230, 210, 30);
        borrar = new JButton("✔");
        borrar.setBounds(250, 230, 45, 30);
        borrar.addActionListener(this);
        verificacion_eliminar = new JLabel("....");
        verificacion_eliminar.setBounds(30, 260, 500, 30);
        JLabel etiquetaImagen = new JLabel(new ImageIcon("src/Imagenes/Captura de pantalla 2024-03-02 204650.png"));
        etiquetaImagen.setBounds(320, -70, 500, 600);
        salirEliminar = new JButton("ATRAS");
        salirEliminar.setBounds(383, 430, 370, 35);
        salirEliminar.addActionListener(this);
        eliminar_Propietario.add(label9);
        eliminar_Propietario.add(salirEliminar);
        eliminar_Propietario.add(etiquetaImagen);
        eliminar_Propietario.add(opcionDelte);
        eliminar_Propietario.add(borrar);
        eliminar_Propietario.add(verificacion_eliminar);
    }
}
