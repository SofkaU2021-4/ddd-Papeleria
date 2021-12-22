package co.com.sofka.GenericVO;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Identificacion implements ValueObject<String> {

    private final String value;

    private Identificacion(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La identifiacion no puede estar vacia");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
