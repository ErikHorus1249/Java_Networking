import java.io.*;
import java.net.Socket;

public class Client {
    public void  connect(){
        try {
            Socket socket = new Socket("localhost",1249);
            //sending to server
//            PrintStream ps = new PrintStream(socket.getOutputStream());
//            ps.println("no more infomation");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(new Student("tuan anh", 15, 166));

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String respone = br.readLine();
            if(respone!=null){
                System.out.printf("respone : "+ respone);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Client c = new Client();
        c.connect();
    }
}


