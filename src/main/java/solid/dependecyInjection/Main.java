package solid.dependecyInjection;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");
		MessagePrinter printer = new MessagePrinter();
		try (PrintWriter writer = new PrintWriter(new FileWriter("withDependencies.txt"))) {//benefit is we can change the dependencies without changing the functionality of the MessagePrinterClass
			Message msgDependecy = new Message("This is a message again with dependencies inversion");
			Message msgText = new Message("This is a message again with Text formatting");
			printer.writeMessageWithInversion(msgDependecy,new JSONFormatter(),writer);//we can use textformatter also
			printer.writeMessageWithInversion(msgText,new TextFormatter(),writer);
		}
		printer.writeMessage(msg, "test_msg.txt");
	}

}
