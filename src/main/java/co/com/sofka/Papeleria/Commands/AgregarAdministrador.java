package co.com.sofka.Papeleria.Commands;

import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Papeleria.value.*;
import co.com.sofka.domain.generic.Command;

public class AgregarAdministrador extends Command {
    private final AdministradorId entityId;
    private final Nombre nombre ;
    private final Identificacion identificacion ;
    private final Direccion direccion;
    private final Email email;

    public AgregarAdministrador(AdministradorId entityId, Nombre nombre, Identificacion identificacion, Direccion direccion, Email email) {
        this.entityId = entityId;
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
