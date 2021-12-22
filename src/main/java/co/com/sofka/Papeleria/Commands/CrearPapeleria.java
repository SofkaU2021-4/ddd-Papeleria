package co.com.sofka.Papeleria.Commands;

import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.Command;

public class CrearPapeleria extends Command {

    private final PapeleriaId entityId;
    private final Nombre nombre;
    private final Direccion direccion;


    public CrearPapeleria(PapeleriaId entityId, Nombre nombre, Direccion direccion) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public PapeleriaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
