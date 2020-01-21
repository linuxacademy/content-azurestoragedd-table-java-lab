package com.linuxacademy.azurestoragedd.table;

public class InventoryItemEntity {
    
    String id;
    String description;
    String ownerName;
    String location;
    
    public InventoryItemEntity(String id, String description, String ownerName, String location) {
        this.id = id;
        this.description = description;
        this.ownerName = ownerName;
        this.location = location;
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
