package test.auth;

import auth.Administrador;
import auth.Autenticacion;
import auth.Estudiante;
import auth.Profesor;
import auth.Usuario;

public class TestAutenticacion {

    public static void main(String[] args) {
        // Crear una instancia de la clase Autenticacion
        Autenticacion auth = new Autenticacion();

        // Crear usuarios de prueba
        Usuario profesor = new Profesor(1, "Profesor Juan", "juan@universidad.com", "profesor123");
        Usuario estudiante = new Estudiante(2, "Estudiante Ana", "ana@estudiante.com", "estudiante456" );
        Usuario administrador = new Administrador(3, "Admin Pedro", "pedro@admin.com", "admin789");

        // Registrar los usuarios en el sistema
        auth.registrarUsuario(profesor);
        auth.registrarUsuario(estudiante);
        auth.registrarUsuario(administrador);

        // Intentar hacer login con las credenciales correctas
        try {
            Usuario usuarioLogueado = auth.login("juan@universidad.com", "profesor123");
            System.out.println("Bienvenido: " + usuarioLogueado.getNombre());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Intentar hacer login con credenciales incorrectas
        try {
            auth.login("ana@estudiante.com", "contraseñaIncorrecta");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Cambiar la contraseña de un usuario
        auth.cambiarContraseña(estudiante, "nuevaContraseña");
        try {
            auth.login("ana@estudiante.com", "nuevaContraseña");
            System.out.println("Inicio de sesión exitoso con la nueva contraseña.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
