package designPatterns.creational.factoryMethod;


import designPatterns.creational.factoryMethod.message.Message;
import designPatterns.creational.factoryMethod.message.TextMessage;

public class Client {

    public static void main(String[] args) {
		/*basically with Factory method the abstract method does not know which implementation to use as it was case with simple factory
		So if we need to add more Implementation such as xmlcreator instead of changing the creator logic as it would have been the case for simplefactory
		 */
        MessageCreator creator = new JSONMessageCreator();
        printMessage(creator);
        printMessage(new TextMessageCreator());

    }

    public static void printMessage(MessageCreator creator) {
        Message message = creator.createMessage();
        System.out.println(message);
    }
}
