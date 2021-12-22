package co.com.sofka.Papeleria.Commands;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.domain.generic.Command;

public class ActualizarEmailAdministrador extends Command {


    private final Email email;

    public ActualizarEmailAdministrador( Email email) {
        this.email = email;
    }


    public Email getEmail() {
        return email;
    }
}
