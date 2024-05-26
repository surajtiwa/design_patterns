package designPatterns.creational.factoryMethod;


import designPatterns.creational.factoryMethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage(String message) {
        Message msg=createMessage();//use this abstract message
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    //abstract method
    public abstract Message createMessage();
}
