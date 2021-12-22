package co.com.sofka.Papeleria.events;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.domain.generic.DomainEvent;

public class DireccionAdministradorCambiada extends DomainEvent {


    private final AdministradorId entityId;
    private final Direccion direccion;

    public DireccionAdministradorCambiada(AdministradorId entityId, Direccion direccion) {
        super("sofka.papeleria.DireccionAdminstradorCambiada");
        this.entityId = entityId;
        this.direccion = direccion;
    }

    public AdministradorId getEntityId() {
        return entityId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
