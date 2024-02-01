package com.company;

public class Inscripcion {
    private int numInscripcion;

    private Categoria categoria;
    private Participante participante;
    private double monto;

    public Inscripcion(int numInscripcion, Categoria categoria, Participante participante, double monto) {
        this.numInscripcion = numInscripcion;
        this.categoria = categoria;
        this.participante = participante;
        this.monto = monto;
    }

    public Inscripcion() {
    }

    public int getNumInscripcion() {
        return numInscripcion;
    }

    public void setNumInscripcion(int numInscripcion) {
        this.numInscripcion = numInscripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public double calcularMonto(Participante p, Categoria categoria) {
        double monto = this.monto;
        if (p.getEdad() > 18) {
            if (categoria.getId() == 1) {
                monto = 1500;
            } else if (categoria.getId() == 2) {
                monto = 2000;
            } else if (categoria.getId() == 3) {
                monto = 0;
            }
        } else {
            if (categoria.getId() == 1) {
                monto = 1500;
            } else if (categoria.getId() == 2) {
                monto = 2300;
            } else if (categoria.getId() == 3) {
                monto = 2000;
            }
        }
        return monto;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "numInscripcion=" + numInscripcion +
                ", categoria=" + categoria.toString() +
                ", participante=" + participante.toString() +
                ", monto=" + monto +
                '}';
    }
/*
    - Inscripción Circuito chico: Menores de 18 años $1300. Mayores de 18 años $1500.
    - Inscripción Circuito medio: Menores de 18 años $2000. Mayores de 18 años $2300.
    - Inscripción Circuito Avanzado: No se permite inscripciones a menores de 18 años. Mayores de 18 años $2800
    */
}






