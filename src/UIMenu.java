import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UIMenu {
    


    public void menuLogin(){
        int limite = 3;
        Scanner entrada =new Scanner(System.in);
        System.out.println("\n" + //
                        "\n" + //
                        "                                                                                                     \n" + //
                        "                                                                                                     \n" + //
                        "    ,---,.                      ,--,                 ___                                             \n" + //
                        "  ,'  .'  \\  ,--,     ,---,   ,--.'|               ,--.'|_                                           \n" + //
                        ",---.' .' |,--.'|   ,---.'|   |  | :      ,---.    |  | :,'                                          \n" + //
                        "|   |  |: ||  |,    |   | :   :  : '     '   ,'\\   :  : ' :                                          \n" + //
                        ":   :  :  /`--'_    :   : :   |  ' |    /   /   |.;__,'  /     ,---.     ,---.     ,--.--.           \n" + //
                        ":   |    ; ,' ,'|   :     |,-.'  | |   .   ; ,. :|  |   |     /     \\   /     \\   /       \\          \n" + //
                        "|   :     \\'  | |   |   : '  ||  | :   '   | |: ::__,'| :    /    /  | /    / '  .--.  .-. |         \n" + //
                        "|   |   . ||  | :   |   |  / :'  : |__ '   | .; :  '  : |__ .    ' / |.    ' /    \\__\\/: . .         \n" + //
                        "'   :  '; |'  : |__ '   : |: ||  | '.'||   :    |  |  | '.'|'   ;   /|'   ; :__   ,\" .--.; |         \n" + //
                        "|   |  | ; |  | '.'||   | '/ :;  :    ; \\   \\  /   ;  :    ;'   |  / |'   | '.'| /  /  ,.  |         \n" + //
                        "|   :   /  ;  :    ;|   :    ||  ,   /   `----'    |  ,   / |   :    ||   :    :;  :   .'   \\        \n" + //
                        "|   | ,'   |  ,   / /    \\  /  ---`-'               ---`-'   \\   \\  /  \\   \\  / |  ,     .-./        \n" + //
                        "`----'      ---`-'  `-'----'     ,--,       ,---.             `----'    `----'   `--`---'            \n" + //
                        "                               ,'_ /|      /__./|                                                    \n" + //
                        "                          .--. |  | : ,---.;  ; |                                                    \n" + //
                        "                        ,'_ /| :  . |/___/ \\  | |                                                    \n" + //
                        "                        |  ' | |  . .\\   ;  \\ ' |                                                    \n" + //
                        "                        |  | ' |  | | \\   \\  \\: |                                                    \n" + //
                        "                        :  | | :  ' ;  ;   \\  ' .                                                    \n" + //
                        "                        |  ; ' |  | '   \\   \\   '                                                    \n" + //
                        "                        :  | : ;  ; |    \\   `  ;                                                    \n" + //
                        "                        '  :  `--'   \\    :   \\ |                                                    \n" + //
                        "                        :  ,      .-./     '---\"                                                     \n" + //
                        "                         `--`----'                                                                   \n" + //
                        "                                                                                                     \n" + //
                        "\n" + //
                        "");

        while (limite > 0) {
            System.out.print("Ingrese su correo: ");
            String usuario = entrada.nextLine();
            System.out.print("contraseña: ");
            String contraseña = entrada.nextLine();

            for(Usuario u : Usuario.listaDeUsuarios){
                if(u.getCorreoElectronico().equals(usuario) && u.getContrasena().equals(contraseña)){
                    System.out.println("Usuario identificado \n");
                    if(u.getTipoUsuario() == "maestro"){
                        System.out.println("Bienvenido maestro " + u.getNombre());
                    }else{
                        System.out.println("Bienvenido estudiante " + u.getNombre());
                    }
                    menuPrincipal();
                    System.exit(0);
                }
            }
            System.out.println("Credencialeas invalidas, intente nuevamnete, \n");
            limite--;
        }

        
    }


    public void menuPrincipal(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n ¿Que desea hacer?");
        System.out.println("\n 1) Consultar libros disponibles \n 2) Solicitar Prestamo \n 3) Devolver Libro \n 4) Consultar prestamos \n 5) Salir");
        //no le metan otro cosa que no sea numero por que truena xd
        int opciones = entrada.nextInt();
        switch (opciones) {
            case 1:Prestamo.Acciones.consultarDisponibilidadLibros(); menuPrincipal();;break;
            case 2:Prestamo.Acciones.solicitarPrestamo(); menuPrincipal();break;
            case 3:Prestamo.Acciones.liquidarPrestamo();menuPrincipal();break;
            case 4:Prestamo.Acciones.consultarPrestamos();menuPrincipal();break;
            case 5:System.out.println("Hasta luego....");break;
        
            default:System.out.println("Ninguna de las opciones coincide, intetelo de nuevo");break;
        }
    }
}
