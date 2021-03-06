package co.com.sofka.Papeleria.events;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.domain.generic.DomainEvent;

public class DireccionAdministradorCambiada extends DomainEvent {


    private final Direccion direccion;

    public DireccionAdministradorCambiada( Direccion direccion) {
        super("sofka.papeleria.DireccionAdminstradorCambiada");
        this.direccion = direccion;
    }



    public Direccion getDireccion() {
        return direccion;
    }
}
