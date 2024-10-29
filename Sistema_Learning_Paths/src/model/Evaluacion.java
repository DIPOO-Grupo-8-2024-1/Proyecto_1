package model;

import java.util.List;

public abstract class Evaluacion extends Actividad {
    private List<Pregunta> preguntas;   // Lista de preguntas asociadas a la evaluación
    private float calificacionMinima;   // Calificación mínima requerida para aprobar la evaluación

    public Evaluacion(int id, String descripcion, String objetivo, int duracionEsperada, List<Pregunta> preguntas, float calificacionMinima) {
        super(id, descripcion, objetivo, duracionEsperada);
        this.preguntas = preguntas;
        this.calificacionMinima = calificacionMinima;
    }

    // Método abstracto que las subclases deben implementar para calificar la evaluación
    public abstract Calificacion calificar(List<RespuestaExamen> respuestas);

    // Getters y setters para acceder a los atributos
    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public float getCalificacionMinima() {
        return calificacionMinima;
    }

    public void setCalificacionMinima(float calificacionMinima) {
        this.calificacionMinima = calificacionMinima;
    }
}


