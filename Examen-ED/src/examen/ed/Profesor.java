package examen.ed;

public class Profesor extends Persona{
    String srt;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }
    
    public void printInformacionPersonal() {
        System.out.println("Nombre: " +srt);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + numeroDeTelefono);
    }
    
    
    public void printTodaLaInformacion() {
        System.out.println("Nombre: " +srt);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + numeroDeTelefono);
        for (Prestamo p: prestamos) {
            System.out.println(p.toString());
        }
    }
}
