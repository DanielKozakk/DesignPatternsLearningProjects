import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    public static void createServer(){
        int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)){


            while (true){
                try (Socket socket = serverSocket.accept()) {
                    handleRequest(socket);
                } catch (IOException e){
                    System.out.println("Client Error: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }

    private static void handleRequest(Socket socket) {
       // ...
    }
}
