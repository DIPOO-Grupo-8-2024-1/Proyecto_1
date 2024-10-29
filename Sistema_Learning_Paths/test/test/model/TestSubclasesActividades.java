package test.model;

import model.Tarea;
import model.Recurso;
import model.Encuesta;
import java.util.Arrays;

public class TestSubclasesActividades {

    public static void main(String[] args) {
        // Crear una instancia de Tarea
        Tarea tarea = new Tarea(1, "Tarea 1", "Aprender OOP", 120, "Instrucciones para la tarea 1");
        tarea.completar();

        // Crear una instancia de Recurso
        Recurso recurso = new Recurso(2, "Recurso 1", "Ver video de patrones de diseño", 90, "video", "https://video.com");
        recurso.completar();

        // Crear una instancia de Encuesta
        Encuesta encuesta = new Encuesta(3, "Encuesta 1", "Feedback sobre el curso", 30, Arrays.asList("¿Te gustó el curso?", "¿Qué mejorarías?"));
        encuesta.completar();
    }
}
