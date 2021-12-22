package co.com.sofka.Bodega.events;

import co.com.sofka.GenericVO.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailBodegueroCambiado extends DomainEvent {
    private final Email email;

    public EmailBodegueroCambiado(Email email) {
        super("sofka.bodega.EmailBodegueroCambiado");
        this.email=email;
    }

    public Email getEmail() {
        return email;
    }
}
