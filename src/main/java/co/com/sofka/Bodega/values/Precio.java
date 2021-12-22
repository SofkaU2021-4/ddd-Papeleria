package co.com.sofka.Bodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Long> {

    private final Long value;

    private Precio(Long value){
        this.value= value;
        if(this.value==null){
            throw new IllegalArgumentException("El precio no puede estar vacio");
        }
    }

    @Override
    public Long value() {
        return value;
    }
}
