package com.linuxacademy.azurestoragedd.table;

import com.microsoft.azure.storage.table.TableServiceEntity;

public class InventoryItemEntity extends TableServiceEntity {
    
    String id;
    String description;
    String ownerName;
    String location;
    
    public InventoryItemEntity(String id, String description, String ownerName, String location) {
        this.rowKey = id;
        this.partitionKey = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
