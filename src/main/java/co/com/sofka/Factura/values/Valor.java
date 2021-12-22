package co.com.sofka.Factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Valor implements ValueObject<Double> {
    private final Double valor;

    public Valor(Double valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if(0>=this.valor){
            throw new IllegalArgumentException("No puede se un valor negativo o cero");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Valor precio = (Valor) o;
        return Objects.equals(valor, precio.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public Double value() {
        return valor;
    }
}
