import java.util.Scanner;

public class Libro {

    
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroPrestados;

    
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroPrestados = 0;
    }

    
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroPrestados = numeroPrestados;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroPrestados() {
        return numeroPrestados;
    }

    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }

    
    public boolean prestamo() {
        if (numeroPrestados < numeroEjemplares) {
            numeroPrestados++;
            return true;
        }
        return false;
    }

    
    public boolean devolucion() {
        if (numeroPrestados > 0) {
            numeroPrestados--;
            return true;
        }
        return false;
    }

    
    @Override
    public String toString() {
        return String.format("Título: %s\nAutor: %s\nEjemplares: %d\nPrestados: %d",
                titulo, autor, numeroEjemplares, numeroPrestados);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("=== Crear un nuevo libro ===");
        System.out.print("Ingrese el título: ");
        String titulo = sc.nextLine();

        System.out.print("Ingrese el autor: ");
        String autor = sc.nextLine();

        System.out.print("Ingrese el número de ejemplares: ");
        int ejemplares = sc.nextInt();

        System.out.print("Ingrese el número de ejemplares prestados: ");
        int prestados = sc.nextInt();

        
        Libro libro = new Libro(titulo, autor, ejemplares, prestados);

        int opcion;
        do {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Mostrar información del libro");
            System.out.println("2. Realizar préstamo");
            System.out.println("3. Realizar devolución");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Información del libro ---");
                    System.out.println(libro);
                    break;

                case 2:
                    if (libro.prestamo()) {
                        System.out.println("\n Préstamo realizado con éxito.");
                    } else {
                        System.out.println("\n No hay ejemplares disponibles para prestar.");
                    }
                    break;

                case 3:
                    if (libro.devolucion()) {
                        System.out.println("\n Devolución realizada con éxito.");
                    } else {
                        System.out.println("\n  No hay ejemplares prestados para devolver.");
                    }
                    break;

                case 4:
                    System.out.println("\n Saliendo del programa...");
                    break;

                default:
                    System.out.println("\n Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }
}


// Respuesta 4
//Genero - String
// idioma - String
