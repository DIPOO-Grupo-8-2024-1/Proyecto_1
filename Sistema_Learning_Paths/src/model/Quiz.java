package model;

import java.util.List;

public class Quiz extends Evaluacion {

    public Quiz(int id, String descripcion, String objetivo, int duracionEsperada, List<Pregunta> preguntas, float calificacionMinima) {
        super(id, descripcion, objetivo, duracionEsperada, preguntas, calificacionMinima);
    }

    @Override
    public Calificacion calificar(List<RespuestaExamen> respuestas) {
        int correctas = 0;

        // Contar respuestas correctas
        for (RespuestaExamen respuesta : respuestas) {
            if (respuesta.getPregunta() instanceof PreguntaAbierta) {
                System.out.println("Respuesta a pregunta abierta: " + respuesta.getRespuestaEstudiante());
            }
            if (respuesta.isCorrecta()) {
                correctas++;
            }
        }

        // Calcular el puntaje basado en respuestas correctas
        float puntaje = (float) correctas / getPreguntas().size() * 10;
        boolean aprobado = puntaje >= getCalificacionMinima();

        return new Calificacion(puntaje, aprobado ? "Aprobado" : "No aprobado");
    }

    @Override
    public boolean completar() {
        this.marcarCompletada();
        this.establecerResultado("Quiz completado con éxito");
        return true;
    }
}




