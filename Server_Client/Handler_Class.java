
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;


    public class HandlerClass implements HttpHandler {

    public void handle(HttpExchange handler_ex) throws IOException {
        
         int port = 9000;                                            
         String response = "Server is running without any problem on Port# " + port;    // display message
         handler_ex.sendResponseHeaders(200, response.length());            // returning the response code back to server
         
         System.out.println(handler_ex.getResponseCode());                  // display the code on server side
         OutputStream os = handler_ex.getResponseBody();                    // object for displaying the response
         os.write(response.getBytes());                                     //  display the response on client side
         
         
         os.close();                                                        // close the stream
       }
}
