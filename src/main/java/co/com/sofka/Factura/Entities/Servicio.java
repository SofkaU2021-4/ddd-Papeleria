package co.com.sofka.Factura.Entities;

import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Servicio extends Entity<IdServicio> {


    public Servicio(Descripcion descripcion, Long valor) {
        this.descripcion = Objects.requireNonNull(descripcion,"descripcion requerido");
        this.valor = Objects.requireNonNull(valor, "valor requerido");
        if (this.valor<=0){
            throw new IllegalArgumentException("El valor debe ser mayor a 0 ");
        }
        if (this.descripcion.isBlank()){
            throw new IllegalArgumentException("El Servicio no puede estar vacio ");
        }
    }

}
