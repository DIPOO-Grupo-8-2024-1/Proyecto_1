package model;

public class Calificacion {
    private float nota;     // Nota obtenida en la evaluación
    private String feedback; // Mensaje que indica si aprobó o no

    // Constructor que inicializa la nota y el feedback
    public Calificacion(float nota, String feedback) {
        this.nota = nota;
        this.feedback = feedback;
    }

    // Getters y setters
    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Nota: " + nota + ", Feedback: " + feedback;
    }
}

