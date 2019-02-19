package examen.ed;

/**
 *
 * @author Hugo
 */
public class Prestamo {
    String prestamo;

    public Prestamo() {
    }

    public String getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(String prestamo) {
        this.prestamo = prestamo;
    }
    
    @Override
    public String toString() {
        return prestamo;
    }
    
    
}