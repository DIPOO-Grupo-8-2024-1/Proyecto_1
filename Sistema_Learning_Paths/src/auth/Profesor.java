package auth;

public class Profesor extends Usuario {
    public Profesor(int id, String nombre, String email, String contraseña) {
        super(id, nombre, email, contraseña, "profesor");
    }

    public void crearLearningPath(String titulo, String descripcion) {
        // Lógica para crear un Learning Path
        System.out.println("Creando Learning Path: " + titulo);
    }

    //métodos
}
