package test.model;

import model.Actividad;

public class TareaPrueba extends Actividad {
    public TareaPrueba(int id, String descripcion, String objetivo, int duracionEsperada) {
        super(id, descripcion, objetivo, duracionEsperada);
    }

    @Override
    public boolean completar() {
        // Lógica específica de completar la tarea
        this.marcarCompletada();
        this.establecerResultado("Tarea completada con éxito");
        return true;
    }
}


