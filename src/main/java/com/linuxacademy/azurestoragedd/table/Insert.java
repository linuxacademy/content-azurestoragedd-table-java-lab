package com.linuxacademy.azurestoragedd.table;

import com.microsoft.azure.storage.*;
import com.microsoft.azure.storage.table.*;

public class Insert {

    public static void main(String[] args) {
        String tableName = "inventory";
        // Get the storage account name and access key from environment variables.
        String storageAccountName = System.getenv("STORAGE_ACCOUNT_NAME");
        String storageAccountKey = System.getenv("STORAGE_ACCOUNT_KEY");
        // Create the connection string for the storage account.
        final String storageConnectionString = "DefaultEndpointsProtocol=http;" +
            "AccountName=" + storageAccountName + ";" +
            "AccountKey=" + storageAccountKey;
        
        try {
            //Retrieve the storage account.
            CloudStorageAccount storageAccount = CloudStorageAccount.parse(storageConnectionString);
            
            // Create a table client.
            CloudTableClient tableClient = storageAccount.createCloudTableClient();

            // Get a reference to the table ands create it if it does not exist.
            CloudTable table = tableClient.getTableReference(tableName);
            table.createIfNotExists();
            
            //Create an Inventory Item entity to insert.
            InventoryItemEntity item = new InventoryItemEntity("E6704", "Haunted Guitar", "Elanor Mosley", "X32B-02");
            
            table.execute(TableOperation.insert(item));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
