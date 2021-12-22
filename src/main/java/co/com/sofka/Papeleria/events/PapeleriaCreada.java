package co.com.sofka.Papeleria.events;

import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class PapeleriaCreada extends DomainEvent {


    private final Nombre nombre;
    private final Direccion direccion;

    public PapeleriaCreada(Nombre nombre , Direccion direccion){
        super("sofka.papeleria.papeleriaCreada");
        this.nombre=nombre;
        this.direccion = direccion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
