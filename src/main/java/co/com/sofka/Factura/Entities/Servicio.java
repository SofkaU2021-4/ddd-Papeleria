package co.com.sofka.Factura.Entities;

import co.com.sofka.Factura.values.Valor;
import co.com.sofka.Factura.values.Descripcion;
import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Servicio extends Entity<IdServicio> {


    private  Descripcion descripcion;
    private Valor valor;

    public Servicio(IdServicio IdEntity, Descripcion descripcion, Valor valor) {
        super(IdEntity);
        this.descripcion=Objects.requireNonNull(descripcion);
        this.valor=Objects.requireNonNull(valor);

    }
    public void ActualizarDescripcion(Descripcion descripcion){
        this.descripcion= Objects.requireNonNull(descripcion);
    }
    public void ActualizarValor(Valor valor){
        this.valor= Objects.requireNonNull(valor);
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Valor getValor() {
        return valor;
    }



}
