package co.com.sofka.Factura.Entities;


import co.com.sofka.Factura.values.IdCliente;
import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente  extends Entity<IdCliente> {

    private final Nombre nombre;
    private final Identificacion identificacion;
    private Direccion direccion;
    private Email email;

    public Cliente(IdCliente entityId , Nombre nombre , Identificacion identificacion , Direccion direccion , Email email) {
        super(entityId);
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.email = email;
    }

    public void ActualizarDireccion(Direccion direccion){
        this.direccion = Objects.requireNonNull(direccion);

    }


    public void ActualizarEmail(Email email){
        this.email = Objects.requireNonNull(email);

    }


    public Nombre nombre() {
        return nombre;
    }

    public Direccion direccion() {
        return direccion;
    }

    public Email email() {
        return email;
    }

    public Identificacion identificacion() {
        return identificacion;
    }
}
