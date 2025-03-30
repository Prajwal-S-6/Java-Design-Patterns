package org.example.abstractfactory.aws;

import org.example.abstractfactory.Instance;
import org.example.abstractfactory.ResourceFactory;
import org.example.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int storageInMiB) {
        return new S3Storage(storageInMiB);
    }
}
