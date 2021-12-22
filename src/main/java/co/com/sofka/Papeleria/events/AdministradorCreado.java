package co.com.sofka.Papeleria.events;

import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Papeleria.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class AdministradorCreado extends DomainEvent {
    private final AdministradorId entityId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final Direccion direccion;
    private final Email email;

    public AdministradorCreado(AdministradorId entityId, Nombre nombre, Identificacion identificacion, Direccion direccion, Email email) {
        super("sofka.papeleria.AdministradorCreado");
        this.entityId=entityId;

        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.email = email;
    }

    public AdministradorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Email getEmail() {
        return email;
    }
}
