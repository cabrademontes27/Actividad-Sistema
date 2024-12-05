import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario("Luis Cabrera", "zs22017032@estudiantes.uv.mx", "1234", "estudiante");
        Usuario usuario2 = new Usuario("Pino Herrera", "jherrera@uv.mx", "1234", "maestro");
        Usuario usuario3 = new Usuario("Josea Antonio", "jvergara@uv.mx", "1234", "maestro");
        Usuario usuario4 = new Usuario("Alejandra", "zs22017015@estudiantes.uv.mx", "1234", "estudiante");

        Libro libro1 = new Libro("Gabriel García Márquez", "Cien Años de Soledad", true);
        Libro libro2 = new Libro("George Orwell", "1984", true);
        Libro libro3 = new Libro("Miguel de Cervantes", "El Quijote", true);
        Libro libro4 = new Libro("Antoine de Saint-Exupéry", "El Principito", true);
















        

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        
        for(Usuario u: usuarios) {
            System.out.println(u);
        }
    }
}
