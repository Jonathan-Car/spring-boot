package com.ejercicio6.eje6;

import java.time.LocalDate;

public class PrediccionDia {
    private LocalDate fecha;
    private int probPrecipitacion;
    private int tempMin;
    private int tempMax;
    private int nivelUV;

    public PrediccionDia(LocalDate fecha, int probPrecipitacion, int tempMin, int tempMax, int nivelUV) {
        this.fecha = fecha;
        this.probPrecipitacion = probPrecipitacion;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.nivelUV = nivelUV;
    }

    public String getUrlImagen() {
        if (this.probPrecipitacion < 25) return "https://www.aemet.es/imagenes/png/estado_cielo/11_g.png";
        if (this.probPrecipitacion < 50) return "https://www.aemet.es/imagenes/png/estado_cielo/12_g.png";
        if (this.probPrecipitacion < 75) return "https://www.aemet.es/imagenes/png/estado_cielo/14_g.png";
        return "https://www.aemet.es/imagenes/png/estado_cielo/25_g.png";
    }

    public LocalDate getFecha() { return fecha; }
    public int getProbPrecipitacion() { return probPrecipitacion; }
    public int getTempMin() { return tempMin; }
    public int getTempMax() { return tempMax; }
    public int getNivelUV() { return nivelUV; }
}