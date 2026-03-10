public class Novela extends Libro {

    private String tipo;

    public Novela(String titulo, String autor, int numeroEjemplares, int numeroPrestados, String tipo) {
        super(titulo, autor, numeroEjemplares, numeroPrestados);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de novela: " + tipo;
    }
}
