import java.util.Scanner;

public class Prestamo {
    
    public static class Acciones {
        public static void solicitarPrestamo() {
            Scanner entrada = new Scanner(System.in);

        
            System.out.print("Ingrese su correo: ");
            String correo = entrada.nextLine();
            Usuario usuario = buscarUsuarioPorCorreo(correo);

            if (usuario != null) {
                System.out.print("Ingrese el titulo del libro: ");
                String titulo = entrada.nextLine();
                Libro libro = buscarLibroPorTitulo(titulo);

                if (libro != null && libro.isDisponibilidad()) {
                    libro.setDisponibilidad(false); 
                    System.out.println("Prestamo realizado exitosamente");
                } else {
                    System.out.println("El libro no esta disponible.");
                }
            } else {
                System.out.println("Usuario no encontrado.");
            }
        }

        public static void consultarPrestamos() {
            
            for (Libro libro : Libro.listaLibroa) {
                if (!libro.isDisponibilidad()) {
                    System.out.println("Libro prestado: " + libro.getTitulo());
                }
            }
        }

        public static void liquidarPrestamo() {
            Scanner entrada = new Scanner(System.in);

           
            System.out.print("Ingrese su correo: ");
            String correo = entrada.nextLine();
            Usuario usuario = buscarUsuarioPorCorreo(correo);

            if (usuario != null) {
                System.out.print("Ingrese el titulo del libro a devolver: ");
                String titulo = entrada.nextLine();
                Libro libro = buscarLibroPorTitulo(titulo);

                if (libro != null && !libro.isDisponibilidad()) {
                    libro.setDisponibilidad(true); 
                    System.out.println("Libro devuelto correctamente");
                } else {
                    System.out.println("Este libro no estaba prestado.");
                }
            } else {
                System.out.println("Usuario no encontrado.");
            }
        }

        public static void consultarDisponibilidadLibros() {
            for (Libro libro : Libro.listaLibroa) {
                if (libro.isDisponibilidad()) {
                    System.out.println("Libro disponible: " + libro.getTitulo());
                }
            }
        }






        private static Usuario buscarUsuarioPorCorreo(String correo) {
            for (Usuario usuario : Usuario.listaDeUsuarios) {
                if (usuario.getCorreoElectronico().equals(correo)) {
                    return usuario;
                }
            }
            return null;
        }

        private static Libro buscarLibroPorTitulo(String titulo) {
            for (Libro libro : Libro.listaLibroa) {
                if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                    return libro;
                }
            }
            return null;
        }
    }
}
