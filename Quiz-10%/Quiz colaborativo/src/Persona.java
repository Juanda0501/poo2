public class Persona {
    private int documento;
    private String nombres;
    private String apellidos;
    private int edad;
    public void propiedad(){
    }
    public Persona() {
    }
    public Persona(int documento, String nombre, String apellido, int edad) {
        this.documento = documento;
        this.nombres = nombre;
        this.apellidos = apellido;
        this.edad = edad;
    }
}