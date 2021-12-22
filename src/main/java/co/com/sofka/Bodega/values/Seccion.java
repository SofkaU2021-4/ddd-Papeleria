package co.com.sofka.Bodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public class Seccion implements ValueObject<String> {

    private final String value;

    private Seccion(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La direccion no puede estar vacia");
        }
    }


    @Override
    public String value() {
        return value;
    }
}
