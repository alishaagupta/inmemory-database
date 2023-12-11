package model;

public class PrimitiveEntry<T> {

    private T value;

    public PrimitiveEntry(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
