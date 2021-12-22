package co.com.sofka.Papeleria.Commands;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.domain.generic.Command;

public class ActualizarDireccion extends Command {


    private final Direccion direccion;

    public ActualizarDireccion( Direccion direccion) {
        this.direccion = direccion;
    }


    public Direccion getEmail() {
        return direccion;
    }
}
