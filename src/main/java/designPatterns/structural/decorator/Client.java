package designPatterns.structural.decorator;

public class Client {

    public static void main(String[] args) {
        Message m = new Base64EncodedMessage(new TextMessage("The <FORCE> is strong with this one!"));//decorators
		Message m1 = new HtmlEncodedMessage(new TextMessage("The <FORCE> is strong with this one!"));//decorators
        System.out.println(m.getContent());
        System.out.println(m1.getContent());
    }
}
