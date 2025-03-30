package org.example.abstractfactory.gcp;


import org.example.abstractfactory.Instance;
import org.example.abstractfactory.ResourceFactory;
import org.example.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int storageInMiB) {
        return new GoogleCloudStorage(storageInMiB);
    }
}
