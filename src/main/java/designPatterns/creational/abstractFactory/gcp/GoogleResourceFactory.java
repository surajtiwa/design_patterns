package designPatterns.creational.abstractFactory.gcp;


import designPatterns.creational.abstractFactory.Instance;
import designPatterns.creational.abstractFactory.ResourceFactory;
import designPatterns.creational.abstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMin) {
        return new GoogleCloudStorage(capMin);
    }
}
