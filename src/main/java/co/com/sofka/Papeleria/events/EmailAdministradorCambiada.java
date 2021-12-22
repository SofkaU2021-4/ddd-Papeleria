package co.com.sofka.Papeleria.events;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailAdministradorCambiada extends DomainEvent {
    private final AdministradorId entityId;
    private final Email email;

    public EmailAdministradorCambiada(AdministradorId entityId, Email email) {
        super("sofka.papeleria.EmailAdminstradorCambiada");
        this.entityId = entityId;
        this.email = email;
    }

    public AdministradorId getEntityId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }
}
