import service.PrimitiveStorageHandler;
import service.StorageHandler;

public class StorageApp{
    public static void main(String[] args) {


    PrimitiveStorageHandler primitiveDataStoreHandler = new PrimitiveStorageHandler();
       primitiveDataStoreHandler.set("Akshay", 1);

       primitiveDataStoreHandler.get("Akshay");
    //    primitiveDataStoreHandler.set("Akshay", true);
       System.out.println(primitiveDataStoreHandler.get("Akshay"));
       primitiveDataStoreHandler.set("Lalalaaaa", 1);
       primitiveDataStoreHandler.set("Hello", "World");
       primitiveDataStoreHandler.delete("23");

       System.out.println(primitiveDataStoreHandler.getKeys());


        //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
    }
}