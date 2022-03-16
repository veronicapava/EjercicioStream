package com.sofka.cajaregistradora;

import java.time.LocalDate;

public class Factura {
    String descripcion;
    int importe;
    int cantidad;
    LocalDate fechaFactura;
    Long codigoFactura;

    public Factura(String descripcion, int importe, int cantidad, LocalDate fechaFactura, Long codigoFactura) {
        this.descripcion = descripcion;
        this.importe = importe;
        this.cantidad = cantidad;
        this.fechaFactura = fechaFactura;
        this.codigoFactura = codigoFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImporte() {
        return importe;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public Long getCodigoFactura() {
        return codigoFactura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "descripcion='" + descripcion + '\'' +
                ", importe=" + importe +
                ", cantidad=" + cantidad +
                ", fechaFactura=" + fechaFactura +
                ", codigoFactura=" + codigoFactura +
                '}';
    }
}
