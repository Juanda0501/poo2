import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Inquilino extends Persona implements ActionListener {
    static int documento;
    static String nombre;
    static String apellido;
    static int edad;
    static long id_inquilino;
    static String numeroContratado;
    static String telefono;
    static String correo;

    Pantalla Registro_Inquilino,Listar_Inquilino, buscar_Inquilino,Actualiza_Inquilino,eliminar_inquilino;
    static JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,labelBuscar,verificacion_eliminar;
    static JTextField opcionA,opcionB,opcionC,opcionD,opcionE,opcionF,opcionG,opcionH,opcionDelte;
    static JButton registrar,salirRegistrar, salirListar, salirbuscar,salirActualizar,salirEliminar,borrar, buscarInquilinoBoton;
    static  JTextArea areaTextoListar,areaTextobuscar;
    static List<Inquilino> inquilinos = new ArrayList<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(registrar)){
            documento = Integer.parseInt(opcionA.getText());
            nombre = opcionB.getText();
            apellido = opcionC.getText();
            edad = Integer.parseInt(opcionD.getText());
            id_inquilino = Integer.parseInt(opcionE.getText());
            numeroContratado = opcionF.getText();
            telefono = opcionG.getText();
            correo = opcionH.getText();
            inquilinos.add(new Inquilino(documento,nombre,apellido,edad,id_inquilino,numeroContratado,telefono,correo));
        } else if (e.getSource().equals(salirRegistrar)) {
            Registro_Inquilino.dispose();
            Inicio inicio = new Inicio();
        } else if (e.getSource().equals(salirListar)) {
            Listar_Inquilino.dispose();
            Inicio inicio = new Inicio();
        } else if (e.getSource().equals(salirbuscar)) {
            buscar_Inquilino.dispose();
            Inicio inicio = new Inicio();
        } else if (e.getSource().equals(salirEliminar)) {
            eliminar_inquilino.dispose();
            Inicio inicio = new Inicio();
        }

    }

    public Inquilino() {
    }

    public Inquilino(int documento, String nombre, String apellido, int edad, long id_inquilino, String numeroContratado, String telefono, String correo) {
        super(documento, nombre, apellido, edad);
        this.id_inquilino = id_inquilino;
        this.numeroContratado = numeroContratado;
        this.telefono = telefono;
        this.correo = correo;
    }

    public static int getDocumento() {
        return documento;
    }

    public static void setDocumento(int documento) {
        Inquilino.documento = documento;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Inquilino.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Inquilino.apellido = apellido;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Inquilino.edad = edad;
    }

    public static long getId_inquilino() {
        return id_inquilino;
    }

    public static void setId_inquilino(long id_inquilino) {
        Inquilino.id_inquilino = id_inquilino;
    }

    public static String getNumeroContratado() {
        return numeroContratado;
    }

    public static void setNumeroContratado(String numeroContratado) {
        Inquilino.numeroContratado = numeroContratado;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Inquilino.telefono = telefono;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        Inquilino.correo = correo;
    }

    public  void RegistrarInquilino(){
        ///Diseño de pantalla REGISTRAR INQUILINO
        label1 = new JLabel("INT__Documento");
        label1.setBounds(120,10,120,30);
        opcionA = new JTextField();
        opcionA.setBounds(120,35,210,35);
        ///opcion
        label2 = new JLabel("STR___Nombre");
        label2.setBounds(120,90,120,30);
        opcionB = new JTextField();
        opcionB.setBounds(120,115,210,35);
        ///opcion C
        label3 = new JLabel("STR___Apellido");
        label3.setBounds(120,170,120,30);
        opcionC = new JTextField();
        opcionC.setBounds(120,195,210,35);
        ///opcion D
        label4 = new JLabel("INT___Edad");
        label4.setBounds(120,250,120,30);
        opcionD = new JTextField();
        opcionD.setBounds(120,275,210,35);
        ///opcion E
        label5 = new JLabel("LONG___ID del inquilino");
        label5.setBounds(120,330,170,30);
        opcionE = new JTextField();
        opcionE.setBounds(120,355,210,35);
        ///opcion F
        label6 = new JLabel("INT___Numero del Contratado");
        label6.setBounds(120,410,200,30);
        opcionF = new JTextField();
        opcionF.setBounds(120,435,210,35);
        ///opcion G
        label7 = new JLabel("INT___Telefono");
        label7.setBounds(120,490,120,30);
        opcionG = new JTextField();
        opcionG.setBounds(120,515,210,35);
        ///opcion H
        label8 = new JLabel("STR___Correo");
        label8.setBounds(120,570,120,30);
        opcionH = new JTextField();
        opcionH.setBounds(120,595,210,35);
        ///logo UNAC
        JLabel etiquetaImagen = new JLabel(new ImageIcon("src/Imagenes/Captura de pantalla 2024-03-02 204650.png"));
        etiquetaImagen.setBounds(365,-70,500,600);
        ///INGRESAR
        registrar = new JButton("Registrar");
        registrar.setBounds(430,470,370,40);
        registrar.addActionListener(this);
        ///Salir
        salirRegistrar = new JButton("ATRAS");
        salirRegistrar.setBounds(430,540,370,40);
        salirRegistrar.addActionListener(this);
        ///Pantalla nueva
        Registro_Inquilino = new Pantalla();
        Registro_Inquilino.setTitle("Registrar Inquilino");
        Registro_Inquilino.setVisible(true);
        ///Agregar Elementos
        Registro_Inquilino.add(opcionA);
        Registro_Inquilino.add(opcionB);
        Registro_Inquilino.add(opcionC);
        Registro_Inquilino.add(opcionD);
        Registro_Inquilino.add(opcionE);
        Registro_Inquilino.add(opcionF);
        Registro_Inquilino.add(opcionG);
        Registro_Inquilino.add(opcionH);
        Registro_Inquilino.add(etiquetaImagen);
        Registro_Inquilino.add(registrar);
        Registro_Inquilino.add(salirRegistrar);
        ///Agregar Labels
        Registro_Inquilino.add(label1);
        Registro_Inquilino.add(label2);
        Registro_Inquilino.add(label3);
        Registro_Inquilino.add(label4);
        Registro_Inquilino.add(label5);
        Registro_Inquilino.add(label6);
        Registro_Inquilino.add(label7);
        Registro_Inquilino.add(label8);
    }

    public  void listarInquilino(){
        areaTextoListar = new  JTextArea();
        areaTextoListar.setBounds(30,30,550,450);
        areaTextoListar.setEditable(false);
        Listar_Inquilino = new Pantalla();
        Listar_Inquilino.setTitle("Listar Inquilinos");
        Listar_Inquilino.setSize(1100, 550);
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
        ///Listar Inquilinos
        String texto = "";
        for (int i = 0; i < inquilinos.size(); i++) {
            String obj =
                    "Inquilino{" +"id_inquilino: " + inquilinos.get(i).getId_inquilino() +
                            " documento: " + inquilinos.get(i).getDocumento() +
                            ", nombre: " + inquilinos.get(i).getNombre() +
                            ", apellido: " + inquilinos.get(i).getApellido() +
                            ", edad: " + inquilinos.get(i).getEdad() +
                            ", numeroContratado: " + inquilinos.get(i).getNumeroContratado() +
                            ", telefono: " + inquilinos.get(i).getTelefono() +
                            ", correo: " + inquilinos.get(i).getCorreo() +
                            "}\n";
            texto += obj;
        }
        areaTextoListar.setText(texto);
        ///Agregar Elementos
        Listar_Inquilino.add(etiquetaImagen);
        Listar_Inquilino.add(salirListar);
        Listar_Inquilino.add(scroll);
    }

    public  void buscarInquilino() {
        // ID a buscar
        labelBuscar = new JLabel("Id del inquilino a buscar");
        labelBuscar.setBounds(30, 40, 230, 30);
        // Punto de digitación ID
        opcionA = new JTextField();
        opcionA.setBounds(30,75,250,30);
        // Area de texto
        areaTextobuscar = new  JTextArea();
        areaTextobuscar.setBounds(30,120,600,400);
        areaTextobuscar.setEditable(false);
        // Buscar Inquilino
        buscar_Inquilino = new Pantalla();
        buscar_Inquilino.setSize(1100, 650);
        buscar_Inquilino.setTitle("Buscar Inquilino");
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
        buscar_Inquilino.add(etiquetaImagen);
        buscar_Inquilino.add(salirbuscar);
        buscar_Inquilino.add(labelBuscar);
        buscar_Inquilino.add(opcionA);
        buscar_Inquilino.add(areaTextobuscar);
        buscar_Inquilino.add(buscarInquilinoBoton);
    }
    public  void actualizaInquilino(){
        label1 = new JLabel("INT__Documento");
        label1.setBounds(120,10,120,30);
        opcionA = new JTextField();
        opcionA.setBounds(120,35,210,35);
        label2 = new JLabel("STR___Nombre");
        label2.setBounds(120,90,120,30);
        opcionB = new JTextField();
        opcionB.setBounds(120,115,210,35);
        label3 = new JLabel("STR___Apellido");
        label3.setBounds(120,170,120,30);
        opcionC = new JTextField();
        opcionC.setBounds(120,195,210,35);
        label4 = new JLabel("INT___Edad");
        label4.setBounds(120,250,120,30);
        opcionD = new JTextField();
        opcionD.setBounds(120,275,210,35);
        label5 = new JLabel("STR___ID del inquilino");
        label5.setBounds(120,330,170,30);
        opcionE = new JTextField();
        opcionE.setBounds(120,355,210,35);
        label6 = new JLabel("INT___Numero del Contratado");
        label6.setBounds(120,410,200,30);
        opcionF = new JTextField();
        opcionF.setBounds(120,435,210,35);
        label7 = new JLabel("INT___Telefono");
        label7.setBounds(120,490,120,30);
        opcionG = new JTextField();
        opcionG.setBounds(120,515,210,35);
        label8 = new JLabel("STR___Correo");
        label8.setBounds(120,570,120,30);
        opcionH = new JTextField();
        opcionH.setBounds(120,595,210,35);
        JLabel etiquetaImagen = new JLabel(new ImageIcon("src/Imagenes/Captura de pantalla 2024-03-02 204650.png"));
        etiquetaImagen.setBounds(365,-70,500,600);
        registrar = new JButton("ACTUALIZAR");
        registrar.setBounds(430,470,370,40);
        registrar.addActionListener(this);
        salirActualizar = new JButton("ATRAS");
        salirActualizar.setBounds(430,540,370,40);
        salirActualizar.addActionListener(this);
        Actualiza_Inquilino = new Pantalla();
        Actualiza_Inquilino.setTitle("Actualizar Inquilino");
        Actualiza_Inquilino.setVisible(true);
        Actualiza_Inquilino.add(opcionA);
        Actualiza_Inquilino.add(opcionB);
        Actualiza_Inquilino.add(opcionC);
        Actualiza_Inquilino.add(opcionD);
        Actualiza_Inquilino.add(opcionE);
        Actualiza_Inquilino.add(opcionF);
        Actualiza_Inquilino.add(opcionG);
        Actualiza_Inquilino.add(opcionH);
        Actualiza_Inquilino.add(etiquetaImagen);
        Actualiza_Inquilino.add(registrar);
        Actualiza_Inquilino.add(salirActualizar);
        Actualiza_Inquilino.add(label1);
        Actualiza_Inquilino.add(label2);
        Actualiza_Inquilino.add(label3);
        Actualiza_Inquilino.add(label4);
        Actualiza_Inquilino.add(label5);
        Actualiza_Inquilino.add(label6);
        Actualiza_Inquilino.add(label7);
        Actualiza_Inquilino.add(label8);
    }
    public  void eliminarInquilino(){
        eliminar_inquilino = new Pantalla();
        eliminar_inquilino.setSize(800,550);
        eliminar_inquilino.setVisible(true);
        eliminar_inquilino.setLocation(330,150);
        eliminar_inquilino.setTitle("Eliminar inquilino");
        label9 = new JLabel("ingrese el ID");
        label9.setBounds(30,198,210,30);
        opcionDelte = new JTextField();
        opcionDelte.setBounds(30,230,210,30);
        borrar = new JButton("✔");
        borrar.setBounds(250,230,45,30);
        borrar.addActionListener(this);
        verificacion_eliminar = new JLabel("....");
        verificacion_eliminar.setBounds(30,260,500,30);
        JLabel etiquetaImagen = new JLabel(new ImageIcon("src/Imagenes/Captura de pantalla 2024-03-02 204650.png"));
        etiquetaImagen.setBounds(320,-70,500,600);
        salirEliminar = new JButton("ATRAS");
        salirEliminar.setBounds(383,430,370,35);
        salirEliminar.addActionListener(this);
        eliminar_inquilino.add(label9);
        eliminar_inquilino.add(salirEliminar);
        eliminar_inquilino.add(etiquetaImagen);
        eliminar_inquilino.add(opcionDelte);
        eliminar_inquilino.add(borrar);
        eliminar_inquilino.add(verificacion_eliminar);
    }
}
