package org.example.NullObject;

public class NullStorageService extends StorageService{

    @Override
    public void save(Report report) {
        System.out.println("Do nothing, because this is just a null object");
    }
}
