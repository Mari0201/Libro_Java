public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Java Basico", "Juan", 5, 1);

        LibroTextoUNIAC libroUNIAC =
                new LibroTextoUNIAC("POO", "Carlos", 10, 2, "Programacion", "Ingenieria");

        Novela novela =
                new Novela("El misterio", "Ana", 4, 1, "Policiaca");

        libro1.prestamo();
        libro1.devolucion();

        System.out.println(libro1);
        System.out.println(libroUNIAC);
        System.out.println(novela);
    }
}
