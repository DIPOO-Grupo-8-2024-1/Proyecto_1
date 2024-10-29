package model;

import auth.Profesor;

public abstract class Actividad {
    private int id;
    private String descripcion;
    private String objetivo;
    private int duracionEsperada;
    private String estado;
    private String resultado;
    private boolean esObligatoria;
    private Profesor creador;
    
    public Actividad(int id, String descripcion, String objetivo, int duracionEsperada, boolean esObligatoria, Profesor creador) {
        this.id = id;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.duracionEsperada = duracionEsperada;
        this.estado = "pendiente";
        this.resultado = "";
        this.esObligatoria = esObligatoria;
        this.creador = creador;
    }

    // Método abstracto que será implementado por las subclases
    public abstract boolean completar();

    // Cambia el estado de la actividad a "completada"
    public void marcarCompletada() {
        this.estado = "completada";
    }

    // Cambia el resultado de la actividad
    public void establecerResultado(String resultado) {
        this.resultado = resultado;
    }

    // Método para clonar una actividad
    public Actividad clonar(Profesor nuevoCreador) {
        try {
            Actividad clon = (Actividad) this.clone();
            clon.creador = nuevoCreador;
            return clon;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar la actividad");
        }
    }

    // Verificar si el creador actual puede editar la actividad
    public boolean puedeEditar(Profesor profesor) {
        return profesor.equals(this.creador);
    }

    // Getters y setters adicionales
    public Profesor getCreador() {
        return creador;
    }

    public void setCreador(Profesor creador) {
        this.creador = creador;
    }

    
    public boolean esObligatoria() {
        return esObligatoria;
    }

    public void setObligatoria(boolean esObligatoria) {
        this.esObligatoria = esObligatoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getDuracionEsperada() {
        return duracionEsperada;
    }

    public void setDuracionEsperada(int duracionEsperada) {
        this.duracionEsperada = duracionEsperada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Actividad ID: " + id + ", Descripción: " + descripcion + ", Estado: " + estado + ", Resultado: " + resultado;
    }
}

