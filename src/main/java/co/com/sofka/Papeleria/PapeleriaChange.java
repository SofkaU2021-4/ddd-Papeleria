package co.com.sofka.Papeleria;

import co.com.sofka.Papeleria.entities.Administrador;
import co.com.sofka.Papeleria.events.AdministradorCreado;
import co.com.sofka.Papeleria.events.DireccionAdministradorCambiada;
import co.com.sofka.Papeleria.events.EmailAdministradorCambiada;
import co.com.sofka.Papeleria.events.PapeleriaCreada;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PapeleriaChange extends EventChange {
    public PapeleriaChange(Papeleria papeleria) {

        apply((PapeleriaCreada event)->{
            papeleria.nombre= event.getNombre();
            papeleria.direccion=event.getDireccion();
            papeleria.facturas = new HashSet<>();
        });

        apply((AdministradorCreado event)->{
            papeleria.administrador = new Administrador(
                    event.getEntityId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getDireccion(),
                    event.getEmail());
        });
        apply((EmailAdministradorCambiada event)->{
            papeleria.administrador.ActualizarEmail(event.getEmail());
        });

        apply((DireccionAdministradorCambiada event)->{
            papeleria.administrador.ActualizarDireccion(event.getDireccion());
        });
    }
}
