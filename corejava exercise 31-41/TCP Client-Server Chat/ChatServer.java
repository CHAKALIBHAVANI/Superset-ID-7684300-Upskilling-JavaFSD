//Chatserver
import java.io.*;
import java.net.*;

public class ChatServer {

    public static void main(String[] args) {

        String serverTitle =
                "TCP Chat Server";

        String serverLocation =
                "Localhost";

        System.out.println(serverTitle);
        System.out.println(serverLocation);

        try {

            ServerSocket server =
                    new ServerSocket(5000);

            Socket socket =
                    server.accept();

            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            String message =
                    input.readLine();

            System.out.println(
                    "Client : " + message);

            socket.close();
            server.close();

        } catch (Exception e) {

            System.out.println(
                    "Server Error");
        }
    }
}