package handler;

import java.util.Set;

import exceptions.InvalidTypeException;
import model.PrimitiveEntry;
import repository.DataStore;

public class PrimitiveTypeHandler {



    public void set(String key, Object value){
        // Type enforcement
        if(DataStore.primitiveEntryMap.containsKey(key)){
            if(validType(key, value)){
                DataStore.primitiveEntryMap.put(key, new PrimitiveEntry(value));
            }else{
                throw new InvalidTypeException("Data Type Error");
            }
        }else{
            DataStore.primitiveEntryMap.put(key, new PrimitiveEntry(value));
        }
    }

    private boolean validType(String key, Object value) {
        if(DataStore.primitiveEntryMap.get(key).getClass() == value.getClass()){
            return true;
        }
        return false;
    }

    public Object get(String key){
        return DataStore.primitiveEntryMap.get(key).getValue();
    }

    public void delete(String key){
        DataStore.primitiveEntryMap.remove(key);
    }
    
    public Set<String> getKeys(){
        return DataStore.primitiveEntryMap.keySet();
    }
}
