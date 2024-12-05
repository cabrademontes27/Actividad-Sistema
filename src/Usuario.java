import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String correoElectronico;
    private String contrasena;
    private static int contador = 1;
    private int id;
    private String tipoUsuario;

    public Usuario (String nombre, String correoElectronico, String contrasena, String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.id = contador++;
    }

    public static List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
    static{
        listaDeUsuarios.add(new Usuario("Luis Cabrera", "zs22017032@estudiantes.uv.mx", "1234", "estudiante"));
        listaDeUsuarios.add(new Usuario("Pino Herrera", "jherrera@uv.mx", "1234", "maestro"));
        listaDeUsuarios.add(new Usuario("Josea Antonio", "jvergara@uv.mx", "1234", "maestro"));
        listaDeUsuarios.add(new Usuario("Alejandra", "zs22017015@estudiantes.uv.mx", "1234", "estudiante"));
    }

    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    



}
