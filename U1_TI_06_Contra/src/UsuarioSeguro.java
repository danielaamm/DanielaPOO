public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    // Setters
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isEmpty()) { //Nota: .isEmpty() es un metodo de la clase String que devuelve true si la longitud de la cadena es 0.
            System.out.println("El nombre de usuario no puede estar vacío");
            return;
        }
        this.nombreUsuario = nombreUsuario;
    }

    //Getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
            return;
        }

        boolean Mayuscula = false;
        boolean Minuscula = false;
        boolean Digito = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) Mayuscula = true;
            else if (Character.isLowerCase(c)) Minuscula = true;
            else if (Character.isDigit(c)) Digito = true;
        }

        if (!Mayuscula) { //Nota: ! Comparador logico de negación
            System.out.println("La contraseña debe tener al menos una letra mayúscula");
            return;
        }
        if (!Minuscula) {
            System.out.println("La contraseña debe tener al menos una letra minúscula");
            return;
        }
        if (!Digito) {
            System.out.println("La contraseña debe tener al menos un dígito");
            return;
        }
        this.password = password;
    }

    // Metodo para autenticar
    public boolean autenticar(String intento) {
        if (password == null) return false;
        return password.equals(intento);
    }
}