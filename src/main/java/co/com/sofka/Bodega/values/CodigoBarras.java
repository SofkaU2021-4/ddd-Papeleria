package co.com.sofka.Bodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CodigoBarras implements ValueObject<String> {
    private final String value;

    private CodigoBarras(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La direccion no puede estar vacia");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodigoBarras that = (CodigoBarras) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
