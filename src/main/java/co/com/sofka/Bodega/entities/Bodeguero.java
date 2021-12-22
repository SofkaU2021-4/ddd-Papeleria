package co.com.sofka.Bodega.entities;

import co.com.sofka.Bodega.values.IdBodeguero;
import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;


public class Bodeguero extends Entity<IdBodeguero> {
    private final Nombre nombre;
    private final Identificacion identificacion;
    private  Email email;
    private  Direccion direccion;

    public Bodeguero(IdBodeguero entityId, Nombre nombre, Identificacion identificacion, Email email , Direccion direccion) {
        super(entityId);
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.direccion=direccion;
    }

    public void ActualizarDireccion(Direccion direccion){
        this.direccion = Objects.requireNonNull(direccion);

    }


    public void ActualizarEmail(Email email){
        this.email = Objects.requireNonNull(email);

    }


}
