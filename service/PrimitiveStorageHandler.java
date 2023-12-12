package service;

import java.util.Arrays;
import java.util.Set;

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

    public void delete(String key){
        primitiveTypeHandler.delete(key);
    }

    public String getKeys(){
        Set<String>  keys = primitiveTypeHandler.getKeys();
        String[] arr = keys.toArray(new String[keys.size()]);
        Arrays.sort(arr);
        return String.join(",",arr);
    }

}
