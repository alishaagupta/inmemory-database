import service.PrimitiveStorageHandler;
import service.StorageHandler;

public class StorageApp{
    public static void main(String[] args) {
    //     StorageHandler storage = new StorageHandler(new PrimitiveStorageHandler());
    //        storage.set("Akshay",100);
    //    storage.get("Akshay");

    PrimitiveStorageHandler primitiveDataStoreHandler = new PrimitiveStorageHandler();
       primitiveDataStoreHandler.set("Akshay", 1);

    //    dataStoreHandler.set("Akshay", 200);
       primitiveDataStoreHandler.get("Akshay");
       primitiveDataStoreHandler.set("Akshay", "Kumar");
       System.out.println(primitiveDataStoreHandler.get("Akshay").toString());

    //    dataStoreHandler.set("Akshay", "3000");
    //    dataStoreHandler.delete("Akshay");
    //    dataStoreHandler.set("Akshay", "3000");
    //    dataStoreHandler.get("Akshay");
        
    }
}