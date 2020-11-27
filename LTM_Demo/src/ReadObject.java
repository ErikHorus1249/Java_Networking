import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws  Exception{
        FileInputStream fis = new FileInputStream("demo.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

//        while (true){
            Student student = (Student) ois.readObject();
            System.out.println(student.toString());
//        }

    }
}
