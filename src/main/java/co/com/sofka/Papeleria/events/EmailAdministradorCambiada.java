package co.com.sofka.Papeleria.events;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailAdministradorCambiada extends DomainEvent {
    private final Email email;

    public EmailAdministradorCambiada( Email email) {
        super("sofka.papeleria.EmailAdminstradorCambiada");

        this.email = email;
    }


    public Email getEmail() {
        return email;
    }
}
