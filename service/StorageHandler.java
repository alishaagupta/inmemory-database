package service;

public class StorageHandler {
    private PrimitiveStorageHandler primitiveStoreHandler;

    public StorageHandler(PrimitiveStorageHandler primitiveStorageHandler){
        this.primitiveStoreHandler = primitiveStoreHandler;
    }

    public void set(String key, Object value){
           primitiveStoreHandler.set(key, value);
    }

    public Object get(String key){
        return primitiveStoreHandler.get(key);
    }

    public void delete(String key){
         primitiveStoreHandler.delete(key);
    }

    public String keys(){
        return primitiveStoreHandler.getKeys();
    }
    
}
