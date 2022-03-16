package com.sofka.cajaregistradora;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacion {

    public static void main(String[] args) {

        //Registros
        Factura factura = new Factura("Lavadora Haceb", 2000, 5, LocalDate.of(2021, 2,25), 001L);
        Factura factura2 = new Factura("Televisor Sony", 1500, 2, LocalDate.of(2020, 1,14), 002L);
        Factura factura3 = new Factura("Telefono Xiaomi", 600, 30, LocalDate.of(1950,12,24), 003L);
        Factura factura4 = new Factura("Telefono Apple", 8500, 2, LocalDate.of(2022,5,16), 004L);
        Factura factura5 = new Factura("Computador Mac", 15000, 1, LocalDate.of(2020,6,1), 005L);

        //Generando una lista
        List<Factura> lista = new ArrayList<Factura>();

        //Agregando los productos a la factura
        lista.add(factura);
        lista.add(factura2);
        lista.add(factura3);
        lista.add(factura4);
        lista.add(factura5);

        //Filtraje funcional con Stream
        List<Factura> facturasPorImporte = lista.stream().filter(elemnt -> elemnt.getImporte() > 6000).collect(Collectors.toList());
        List<Factura> cantidadDeProduto = lista.stream().filter(elemnt -> elemnt.getCantidad() == 30).collect(Collectors.toList());
        List<Factura> facturasPorNumero = lista.stream().filter(elemnt -> elemnt.getCodigoFactura() == 4).collect(Collectors.toList());
        List<Factura> facturaDiaEspecifico = lista.stream().filter(elemnt -> elemnt.getFechaFactura()
                .equals(LocalDate.of(2021,02,25))).collect(Collectors.toList());
        List<Factura> facturaFechaAntesDe = lista.stream().filter(elemnt -> elemnt.getFechaFactura().
                isBefore(LocalDate.of(2021,02,25))).collect(Collectors.toList());
        List<Factura> facturaFechaDespuesDe = lista.stream().filter(elemnt -> elemnt.getFechaFactura().
                isAfter(LocalDate.of(2023,02,25))).collect(Collectors.toList());


        //Imprimiendo facturas
        System.out.println(facturasPorImporte.isEmpty()?"No se encontraron facturas que tengan electrodomésticos con el importe ingresado":
                "Facturas solicitadas por electrodomésticos con el importe ingresado: \n"+facturasPorImporte);

        System.out.println(cantidadDeProduto.isEmpty()?"No se encontraron facturas para determinada cantidad de electrodomésticos":
                "Facturas solicitadas con cierta cantidad de electrodomésticos: \n"+
                cantidadDeProduto);

        System.out.println(facturasPorNumero.isEmpty()?"No hay facturas con el número ingresado":
        "Factura por el número ingresado: \n" + facturasPorNumero);

        System.out.println(facturaDiaEspecifico.isEmpty()?"No se encontraron facturas con esa fecha ingresada":
                "Facturas con la fecha específica ingresada: \n" +  facturaDiaEspecifico);

        System.out.println(facturaFechaAntesDe.isEmpty()?"No se encontraron facturas antes de esa fecha ingresada ":
                "Facturas antes de la fecha ingresada: \n" +  facturaFechaAntesDe);

        System.out.println(facturaFechaDespuesDe.isEmpty()?"No se encontraron facturas despues de esa fecha ingresada":
                "Facturas despues de la fecha ingresada: \n" +  facturaFechaDespuesDe);

    }
}
