package co.com.sofka.Papeleria;

import co.com.sofka.Bodega.values.IdBodega;
import co.com.sofka.Factura.values.IdFactura;
import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Papeleria.entities.Administrador;
import co.com.sofka.Papeleria.events.AdministradorCreado;
import co.com.sofka.Papeleria.events.DireccionAdministradorCambiada;
import co.com.sofka.Papeleria.events.EmailAdministradorCambiada;
import co.com.sofka.Papeleria.events.PapeleriaCreada;
import co.com.sofka.Papeleria.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Papeleria extends AggregateEvent<PapeleriaId> {

    protected Direccion direccion;
    protected Nombre nombre;
    protected Administrador administrador;
    protected Set<IdFactura>  facturas;
    protected IdBodega bodegaId;


    public  Papeleria(PapeleriaId entityId, Nombre nombre , Direccion direccion ){
        super(entityId);
        this.direccion = direccion;
        this.nombre = nombre;
        appendChange(new PapeleriaCreada(nombre ,direccion)).apply();
    }

    private Papeleria(PapeleriaId entityId){
        super(entityId);
        subscribe(new PapeleriaChange(this));
    }

    public static Papeleria from(PapeleriaId papeleriaId, List<DomainEvent> events){
        var papeleria = new Papeleria(papeleriaId);
        events.forEach(papeleria::applyEvent);
        return papeleria;
    }

    public void agregarAdministrador(AdministradorId entityId , Nombre nombre , Identificacion identificacion , Direccion direccion , Email email){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(email);
        Objects.requireNonNull(identificacion);
        appendChange(new AdministradorCreado(entityId,nombre,identificacion,direccion,email)).apply();
    }
    public void  actualizarEmailAdministrador( Email email){

        Objects.requireNonNull(email);
        appendChange(new EmailAdministradorCambiada(email)).apply();
    }
    public void  actualizarDireccion( Direccion direccion){
        Objects.requireNonNull(direccion);
        appendChange(new DireccionAdministradorCambiada(direccion)).apply();
    }

    public Optional<IdFactura> getFacturaPorId(IdFactura entityId ){
        return facturas.stream()
                .filter(factura-> factura.equals(entityId))
                .findFirst();
    }


    public Direccion direccion() {
        return direccion;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Administrador administrador() {
        return administrador;
    }

    public Set<IdFactura> facturas() {
        return facturas;
    }

    public IdBodega bodegaId() {
        return bodegaId;
    }
}
