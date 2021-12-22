package co.com.sofka.Bodega.Commands;

import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.Command;

public class CrearBodega extends Command {

    private final PapeleriaId papeleriaId;

    public CrearBodega(PapeleriaId papeleriaId){
        this.papeleriaId = papeleriaId;
    }

    public PapeleriaId getPapeleriaId() {
        return papeleriaId;
    }
}
