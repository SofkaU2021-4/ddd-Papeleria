package co.com.sofka.Bodega.events;


import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.DomainEvent;

public class BodegaCreada extends DomainEvent {


    private final PapeleriaId papeleriaId;

    public BodegaCreada(PapeleriaId papeleriaId){
        super("sofka.papeleria.papeleriaCreada");
        this.papeleriaId = papeleriaId;
    }

    public PapeleriaId getPapeleriaId() {
        return papeleriaId;
    }
}
