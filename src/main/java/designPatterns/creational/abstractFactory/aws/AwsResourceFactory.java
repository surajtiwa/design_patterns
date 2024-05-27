package designPatterns.creational.abstractFactory.aws;


import designPatterns.creational.abstractFactory.Instance;
import designPatterns.creational.abstractFactory.ResourceFactory;
import designPatterns.creational.abstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMin) {
        return new S3Storage(capMin);
    }
}
