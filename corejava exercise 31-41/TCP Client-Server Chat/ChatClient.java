
//Chat Client
import java.io.*;
import java.net.*;

public class ChatClient {

        public static void main(String[] args) {

                String clientTitle = "TCP Chat Client";

                String messageType = "Greeting Message";

                System.out.println(clientTitle);
                System.out.println(messageType);

                try {

                        Socket socket = new Socket(
                                        "localhost",
                                        5000);

                        PrintWriter output = new PrintWriter(
                                        socket.getOutputStream(),
                                        true);

                        output.println(
                                        "Hello Server");

                        socket.close();

                } catch (Exception e) {

                        System.out.println(
                                        "Client Error");
                }
        }
}