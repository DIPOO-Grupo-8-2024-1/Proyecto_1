package model;

import java.util.List;

public class Encuesta extends Actividad {
    private List<String> preguntasAbiertas;

    public Encuesta(int id, String descripcion, String objetivo, int duracionEsperada, List<String> preguntasAbiertas) {
        super(id, descripcion, objetivo, duracionEsperada);
        this.preguntasAbiertas = preguntasAbiertas;
    }

    @Override
    public boolean completar() {
        // Simula la lógica de completado de la encuesta
        this.marcarCompletada();
        this.establecerResultado("Encuesta completada");
        System.out.println("Encuesta completada: " + this.getDescripcion());
        return true;
    }

    // Getters y setters
    public List<String> getPreguntasAbiertas() {
        return preguntasAbiertas;
    }

    public void setPreguntasAbiertas(List<String> preguntasAbiertas) {
        this.preguntasAbiertas = preguntasAbiertas;
    }
}
