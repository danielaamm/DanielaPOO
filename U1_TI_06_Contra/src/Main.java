import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto para conectar ambas clases
        UsuarioSeguro usuario = new UsuarioSeguro();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        String nombre = sc.nextLine();
        usuario.setNombreUsuario(nombre);

        System.out.print("Ingresa tu contraseña: ");
        String pass = sc.nextLine();
        usuario.setPassword(pass);

        if (usuario.getNombreUsuario() == null || usuario.getPassword() == null) {
            System.out.println("Usuario o contraseña inválidos");
            sc.close();
            return;
        }

        //Intento contraseña incorrectaa
        System.out.println("Validación de contraseña");
        System.out.println("Contraeña: 123hola");
        if (usuario.autenticar("123hola")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        //Valida la contraseña ingresada
        System.out.print("Contraseña: ");
        String autentificar = sc.nextLine();
        if (usuario.autenticar(autentificar)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        sc.close();
    }
}
