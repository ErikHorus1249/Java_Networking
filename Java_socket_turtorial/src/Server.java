import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
     public void serve(){
         try {
             ServerSocket  server =  new ServerSocket(1249);
             System.out.printf("Server is running ...");
             Socket socket = server.accept();
//             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//             String request = br.readLine();

             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
             try {
                 Student student = (Student) ois.readObject();
                 if(student != null){

                     System.out.println(student.toString());
                 }
                 else {
                     System.out.println("Nothing");
                 }
             } catch (ClassNotFoundException e) {
                 e.printStackTrace();
             }


//             if(request!=null){
//                 System.out.printf("Gui tu client : "+request);
//                 // process :
//                 // respone : DO anything
//                 PrintStream ps = new PrintStream(socket.getOutputStream());
//                 ps.println(request.toUpperCase());
//             }

         } catch (IOException e) {
             e.printStackTrace();
         }

     }

    public static void main(String[] args) {
        Server server = new Server();
        server.serve();
    }
}
