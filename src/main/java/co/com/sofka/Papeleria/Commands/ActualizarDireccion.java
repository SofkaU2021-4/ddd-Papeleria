package co.com.sofka.Papeleria.Commands;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.domain.generic.Command;

public class ActualizarDireccion extends Command {

    private final AdministradorId entityId;
    private final Direccion direccion;

    public ActualizarDireccion(AdministradorId entityId, Direccion direccion) {
        this.entityId = entityId;
        this.direccion = direccion;
    }

    public AdministradorId getEntityId() {
        return entityId;
    }

    public Direccion getEmail() {
        return direccion;
    }
}
