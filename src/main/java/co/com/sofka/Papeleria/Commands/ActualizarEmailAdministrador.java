package co.com.sofka.Papeleria.Commands;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.domain.generic.Command;

public class ActualizarEmailAdministrador extends Command {

    private final AdministradorId entityId;
    private final Email email;

    public ActualizarEmailAdministrador(AdministradorId entityId, Email email) {
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
