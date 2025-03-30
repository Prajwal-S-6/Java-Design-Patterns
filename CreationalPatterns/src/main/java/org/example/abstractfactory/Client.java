package org.example.abstractfactory;


import org.example.abstractfactory.aws.AwsResourceFactory;
import org.example.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int capInMiB) {
        Instance instance = this.factory.createInstance(capacity);
        Storage storage = this.factory.createStorage(capInMiB);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
    	Client awsClient = new Client(new AwsResourceFactory());
        Instance awsServer = awsClient.createServer(Instance.Capacity.micro, 4080);
        awsServer.start();
        awsServer.stop();

        System.out.println("---------------------------------------------------------------------------------------------------");

        Client googleClient = new Client(new GoogleResourceFactory());
        Instance googleServer = googleClient.createServer(Instance.Capacity.large, 2080);
        googleServer.start();
        googleServer.stop();


    }

}
