package model;

import java.util.List;

public class Examen extends Evaluacion {

    public Examen(int id, String descripcion, String objetivo, int duracionEsperada, List<Pregunta> preguntas, float calificacionMinima) {
        super(id, descripcion, objetivo, duracionEsperada, preguntas, calificacionMinima);
    }

    @Override
    public Calificacion calificar(List<RespuestaExamen> respuestas) {
        int correctas = 0;

        // Contar respuestas correctas
        for (RespuestaExamen respuesta : respuestas) {
            if (respuesta.isCorrecta()) {
                correctas++;
            }
        }

        // Calcular calificación basada en respuestas correctas
        float puntaje = (float) correctas / getPreguntas().size() * 10;
        boolean aprobado = puntaje >= getCalificacionMinima();

        return new Calificacion(puntaje, aprobado ? "Aprobado" : "No aprobado");
    }

    @Override
    public boolean completar() {
        this.marcarCompletada();
        this.establecerResultado("Examen completado con éxito");
        return true;
    }
}

