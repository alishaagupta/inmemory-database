package service;

import exceptions.InvalidTypeException;
import handler.PrimitiveTypeHandler;

public class PrimitiveStorageHandler {
    private PrimitiveTypeHandler primitiveTypeHandler;

    public PrimitiveStorageHandler() {
        this.primitiveTypeHandler = new PrimitiveTypeHandler();
    }
    
    public Object get(String key) {
        Object value = primitiveTypeHandler.get(key);
        return value;
    }

    public void set(String key, Object value) {
        try {
            primitiveTypeHandler.set(key, value);
        } catch (InvalidTypeException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("successfully added. key: " + key + " value:" + value);
    }

}
