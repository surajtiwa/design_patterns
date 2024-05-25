package solid.dependecyInjection;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

    //Writes message to a file
    public void writeMessage(Message msg, String fileName) throws IOException {
        Formatter formatter = new JSONFormatter();//creates formatter tightly coupling
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //creates print writer tightly coupling
            writer.println(formatter.format(msg)); //formats and writes message
            writer.flush();
        }
    }

    public void writeMessageWithInversion(Message msg, Formatter formatter, PrintWriter writer) throws IOException {//we provide dependencies for Loose coupling this is inversion Of control
        writer.println(formatter.format(msg)); //formats and writes message
        writer.flush();
    }

}
