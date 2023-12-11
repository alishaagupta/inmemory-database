package handler;

import model.PrimitiveEntry;
import repository.DataStore;

public class PrimitiveTypeHandler {

    public PrimitiveTypeHandler(){

    }

    public void set(String key, Object value){
        DataStore.primitiveEntryMap.put(key, new PrimitiveEntry(value));
    }

    public Object get(String key){
        return DataStore.primitiveEntryMap.get(key).getValue();
    }
    
}
