package co.com.sofka.Papeleria.Commands;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.domain.generic.Command;

public class actualizarDireccionAdminstrador extends Command {


    private final Direccion direccion;

    public actualizarDireccionAdminstrador(Direccion direccion) {
        this.direccion = direccion;
    }


    public Direccion getEmail() {
        return direccion;
    }
}
