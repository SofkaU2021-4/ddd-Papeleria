package co.com.sofka.Bodega.Commands;

import co.com.sofka.GenericVO.Email;

public class ActualizarEmailBodeguero {

    private final Email email;

    public ActualizarEmailBodeguero(Email email) {
        this.email=email;
    }

    public Email getEmail() {
        return email;
    }
}
