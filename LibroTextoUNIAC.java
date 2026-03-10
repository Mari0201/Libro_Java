public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares, int numeroPrestados, String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroPrestados, curso);
        this.facultad = facultad;
    }

    public String toString() {
        return super.toString() + "\Facultad: " + facultad;
    }
}
